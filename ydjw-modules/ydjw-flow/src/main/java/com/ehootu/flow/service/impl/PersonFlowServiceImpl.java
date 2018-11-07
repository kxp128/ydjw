package com.ehootu.flow.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ehootu.census.model.OutCensus;
import com.ehootu.census.service.CensusService;
import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.generic.GenericServiceImpl;
import com.ehootu.core.util.DateUtils;
import com.ehootu.core.util.GetNumberUtils;
import com.ehootu.core.util.HttpRequest;
import com.ehootu.core.util.Query;
import com.ehootu.flow.controller.PersonFlowController;
import com.ehootu.flow.dao.ApprovalMapper;
import com.ehootu.flow.dao.PersonFlowMapper;
import com.ehootu.flow.model.Approval;
import com.ehootu.flow.model.InputPersonFlow;
import com.ehootu.flow.model.OutApprovalList;
import com.ehootu.flow.model.OutPersonFlowApproval;
import com.ehootu.flow.model.OutResultList;
import com.ehootu.flow.model.PersonFlow;
import com.ehootu.flow.service.PersonFlowService;
import com.ehootu.user.dao.PoliceMapper;
import com.ehootu.user.dao.UserMapper;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.User;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.ConnectException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title:PersonFlowServiceImpl
 * @Author: KongXiaoPing
 * @Date: 2017-09-21 16:03
 * @Description:
 */
@Service
public class PersonFlowServiceImpl extends GenericServiceImpl<PersonFlow, String> implements PersonFlowService {
    private final static Logger log = LoggerFactory.getLogger(PersonFlowController.class);
    @Autowired
    private PersonFlowMapper personFlowMapper;
    @Autowired
    private ApprovalMapper approvalMapper;
    @Autowired
    private PoliceMapper policeMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CensusService censusService;


    @Override
    public GenericDao<PersonFlow, String> getDao() {
        return personFlowMapper;
    }


    @Override
    public List<OutPersonFlowApproval> queryPersonFlowPendingApproval(Query query) {
        return personFlowMapper.queryPersonFlowPendingApproval(query);
    }

    @Override
    public void addPersonFlow(InputPersonFlow inputPersonFlow) throws Exception {
        log.info("inputPersonFlow--->" + inputPersonFlow);
        //返回语句
        String msg_content = "";

        JSONObject dobj = null;
        //所属派出所
        String suosupaichusuo = "";
        //所属警务室
        String policeOffice = "";

        //42位地址编码
        String mpdm = inputPersonFlow.getMpdm();

        try {
            if (null != inputPersonFlow.getUserId()) {
                User user = new User();
                if (null != inputPersonFlow.getWeixinId()) {
                    user.setWeixinId(inputPersonFlow.getWeixinId());
                } else {
                    msg_content = "添加流动人口时没有传入微信id";
                    throw new NullPointerException(msg_content);
                }
                user.setId(inputPersonFlow.getUserId());
                //添加weixinID
                userMapper.updateByPrimaryKeySelective(user);
            } else {
                log.info("用户id为空");
            }
//            德阳项目演示时候，不会传用户id
//            else {
//                msg_content = "用户id为空";
//                throw new NullPointerException(msg_content);
//            }

            //扫码二维码得到所属派出所
            if (null != mpdm) {
                log.info("scanCode:" + inputPersonFlow);
                if (StringUtils.isNotBlank(mpdm)) {
                    // 从后往前截取,201106000 ===> 2011106
//				mpdm = StringUtils.stripEnd(mpdm, "0");
                    while (mpdm.endsWith("000000")) {
                        mpdm = mpdm.substring(0, mpdm.length() - 6);
                    }
                }
                //调用基库数据接口
                String result = HttpRequest.sendGet(HttpRequest.URL + "querSuoSuPaiChuSuo.html", "dizhibianma=" + mpdm);
                log.info("result--" + result);
                // String 转json对象
                JSONObject aobj = JSONObject.parseObject(result);
                //取出json中的值
                dobj = aobj.getJSONObject("data");
            }
            //根据行政区划名称+街路巷+门牌号+楼栋号 得到所属派出所
            else if (null != inputPersonFlow.getXzqhmc()) {
                // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
                String param = "xzqhmc=" + URLEncoder.encode(inputPersonFlow.getXzqhmc(), "utf-8") + "&jlxmc="
                        + URLEncoder.encode(inputPersonFlow.getJlxmc(), "utf-8") + "&mphmc="
                        + URLEncoder.encode(inputPersonFlow.getMphmc(), "utf-8") + "&mphhz="
                        + URLEncoder.encode(inputPersonFlow.getMphhz(), "utf-8") + "&page="
                        + URLEncoder.encode(String.valueOf(inputPersonFlow.getPage()), "utf-8") + "&limit="
                        + URLEncoder.encode(String.valueOf(inputPersonFlow.getLimit()), "utf-8");
                String lines = HttpRequest.sendGet(HttpRequest.GET_URL_DZ, param);
                log.info("lines--" + lines);
                // String 转json对象
                JSONObject aobj = JSONObject.parseObject(lines);
                //取出json中的值
                dobj = aobj.getJSONObject("page");
                //乱扫二维码
            } else {
                msg_content = "扫码地址无效";
                throw new NullPointerException(msg_content);
            }
            if (null != dobj) {
                suosupaichusuo = (String) dobj.get("suosupaichusuo");
                //所属警务室
                policeOffice = (String) dobj.get("ssjdsqjwhmc");
                log.info("suosupaichusuo--" + suosupaichusuo);
                log.info("policeOffice--" + policeOffice);
            } else {
                msg_content = "扫码地址无效";
                throw new NullPointerException(msg_content);
            }
            PersonFlow personFlow = new PersonFlow(inputPersonFlow);
            //流入时间
            Date inflowTime = DateUtils.parseDate(inputPersonFlow.getInflowTime());
            //流出时间
            Date outflowTime = DateUtils.parseDate(inputPersonFlow.getOutflowTime());


            personFlow.setInflowTime(inflowTime);
            personFlow.setOutflowTime(outflowTime);
            //登记时间
            personFlow.setInputTime(new Date());
            personFlow.setPoliceStation(suosupaichusuo);
            personFlow.setPoliceOffice(policeOffice);
            //设置编号 15位
            personFlow.setNumber(GetNumberUtils.getNumber());
            log.info("personFlow--" + personFlow);
            //操作类型 1代表从微信端录入 2代表从警察直接录入
            personFlow.setOperator("1");
            //添加流动人口
            addPeronFlow(personFlow);
        } catch (ConnectException e) {
            throw new ConnectException();
        }
    }


    /**
     * 添加流动人口
     *
     * @param personFlow 流动人口对象实体
     */
    public void addPeronFlow(PersonFlow personFlow) {
        log.info("personFlow:" + personFlow);
        //添加流动人口
        personFlowMapper.insertSelective(personFlow);
        log.info("添加所属派出所后的流动人口id---" + personFlow.getId());

        Approval approval = new Approval();
        //设置流动人口id
        log.info("personFlowId--" + personFlow.getId());
        approval.setPersonFlowId(personFlow.getId());
        approval.setAcceptNumber(DateUtils.formatDate(new Date(), "yyyyMMddHHmmss"));
        //审核状态(0未审核，1驳回,2审核通过)
        approval.setApprovalStatus(0);

        //添加审核编号
        approvalMapper.insertSelective(approval);

    }



    @Override
    public OutPersonFlowApproval selectByPersonFlowId(String id) {
        return personFlowMapper.selectByPersonFlowId(id);
    }

    @Override
    public Police selectByPoliceId(String policeId) {
        return policeMapper.selectByPrimaryKey(policeId);

    }

    @Override
    public List<OutPersonFlowApproval> appQueryPersonFlow(Map<String, Object> map) {
        return personFlowMapper.appQueryPersonFlow(map);
    }

    @Override
    public List<OutApprovalList> queryApprovalList(Map<String, Object> params) {
        return personFlowMapper.queryApprovalList(params);
    }

    @Override
    public List<OutResultList> queryResultByUserId(Map<String, Object> params) {
        return personFlowMapper.queryResultByUserId(params);
    }

    @Override
    public List<OutPersonFlowApproval> queryPersonFlowApprovaled(Query query) {
        return personFlowMapper.queryPersonFlowApprovaled(query);
    }

    @Override
    public OutResultList queryResultById(OutResultList outResultList) {
        OutResultList outResultList2 = new OutResultList();
        if (null != outResultList.getType()) {
            //户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销 流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
            if (outResultList.getType() > 3) {
                Map<String,Object> map = new HashMap<>();
                //业务id
                map.put("id",outResultList.getId());
                //警察id
                map.put("policeId",outResultList.getPoliceId());
                //type：户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销 流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
                map.put("type",outResultList.getType());
                //微信服务号个人办事结果 条件查询户籍审批详情
                OutCensus outCensus = censusService.queryCensusDetail(map);
                if (null != outCensus){
                    //设置办事结果值
                    outResultList2 = getOutResult(outCensus);
                }else {
                    throw new NullPointerException("传入的户籍id或者户籍类型错误");
                }
            } else {
                // 根据流动人口id查询户籍审批详情
                OutPersonFlowApproval outPersonFlowApproval = personFlowMapper.queryPersonFlowById(outResultList.getId());
                if(null != outPersonFlowApproval){
                    //根据流动人口 设置办事结果值
                    outResultList2 = getOutResult2(outPersonFlowApproval);
                }else {
                    throw new NullPointerException("传入的流动人口id或者流动人口类型错误");
                }

            }

        }
        return outResultList2;

    }

    /**
     * 根据流动人口 设置办事结果值
     *
     * @param outPersonFlowApproval outCensus
     */
    private OutResultList getOutResult2(OutPersonFlowApproval outPersonFlowApproval) {
        OutResultList outResultList = new OutResultList();
        outResultList.setAcceptNumber(outPersonFlowApproval.getAcceptNumber());
        outResultList.setApprovalStatus(outPersonFlowApproval.getApprovalStatus());
        outResultList.setInputTime(outPersonFlowApproval.getDateInputTime());
        outResultList.setType(outPersonFlowApproval.getFloatingPopulationType());
        outResultList.setApprovalSuggestion(outPersonFlowApproval.getApprovalSuggestion());
        outResultList.setApprovalime(outPersonFlowApproval.getDateApprovalTime());
        return outResultList;
    }

    /**
     * 根据户籍业务 设置办事结果值
     *
     * @param outCensus
     */
    private OutResultList getOutResult(OutCensus outCensus) {
        OutResultList outResultList = new OutResultList();
        outResultList.setAcceptNumber(outCensus.getAcceptNumber());
        outResultList.setApprovalStatus(outCensus.getApprovalStatus());
        outResultList.setInputTime(outCensus.getSubmitTime());
        outResultList.setType(outCensus.getCurrentCensusType());
        outResultList.setApprovalSuggestion(outCensus.getApprovalSuggestion());
        outResultList.setApprovalime(outCensus.getDateApprovalTime());
        return outResultList;
    }
}
