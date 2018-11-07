package com.ehootu.flow.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ehootu.census.model.CensusApprovalSet;
import com.ehootu.census.service.CensusService;
import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.*;
import com.ehootu.flow.model.*;
import com.ehootu.flow.service.ApprovalService;
import com.ehootu.flow.service.PersonFlowService;
import com.ehootu.sys.entity.RedPacketAmountSettingEntity;
import com.ehootu.sys.entity.RedPacketSendLogEntity;
import com.ehootu.sys.service.RedPacketAmountSettingService;
import com.ehootu.sys.service.RedPacketSendLogService;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.User;
import com.ehootu.user.service.PoliceService;
import com.ehootu.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Title:PersonFlowController
 * @Author: KongXiaoPing
 * @Date: 2017-09-21 13:58
 * @Description:流动人口业务控制器
 */
@Controller
@RequestMapping(value = "/flow")
public class PersonFlowController extends BaseController {
    private final static Logger log = LoggerFactory.getLogger(PersonFlowController.class);

    @Autowired
    private PersonFlowService personFlowService;
    @Autowired
    private ApprovalService approvalService;
    @Autowired
    private UserService userService;
    @Autowired
    private CensusService censusService;
    @Autowired
    private RedPacketSendLogService redPacketSendLogService;
    @Autowired
    private PoliceService policeService;

    @Autowired
    private RedPacketAmountSettingService redPacketAmountSettingService;
    /**
     * 微信端添加流动人口
     *
     * @param inputPersonFlow 流动人口输入参数实体
     */
    @RequestMapping(value = "/addPeronFlow")
    public void addPeronFlow(InputPersonFlow inputPersonFlow) {
        try {
            personFlowService.addPersonFlow(inputPersonFlow);
            resultSuccess();
        } catch (ConnectException e) {
            e.printStackTrace();
            resultError("500", "调基库连接异常");
        } catch (IOException e) {
            e.printStackTrace();
            resultError("500", "IO异常");
        } catch (NullPointerException e) {
            e.printStackTrace();
            resultError("500", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }

    }

    /**
     * 警察app端添加流动人口
     *
     * @param inputPersonFlow 流动人口输入参数实体(需要传入警察id)
     */
    @RequestMapping(value = "/appAddPeronFlow")
    public void appAddPeronFlow(InputPersonFlow inputPersonFlow) {
        log.info("inputPersonFlow-->" + inputPersonFlow);
        log.info("policeId-->" + inputPersonFlow.getPoliceId());
        try {
            PersonFlow personFlow = new PersonFlow(inputPersonFlow);
            //流入时间
            Date inflowTime = DateUtils.parseDate(inputPersonFlow.getInflowTime());
            //流出时间
            Date outflowTime = DateUtils.parseDate(inputPersonFlow.getOutflowTime());
            personFlow.setInflowTime(inflowTime);
            personFlow.setOutflowTime(outflowTime);
            //登记时间
            personFlow.setInputTime(new Date());
            //所属警务室
            personFlow.setPoliceOffice(inputPersonFlow.getPoliceOffice());
            //所属派出所
            personFlow.setPoliceStation(inputPersonFlow.getPoliceStation());
            //设置编号 15位
            personFlow.setNumber(GetNumberUtils.getNumber());
            log.info("personFlow--" + personFlow);
            //操作类型 1代表从微信端录入 2代表从警察直接录入
            personFlow.setOperator("2");
            personFlowService.insert(personFlow);
            resultSuccess();
        } catch (Exception e) {
            resultError("500", "app添加流动人口出错");
        }


    }


    /**
     * 调 标准地名地址库接口 通过行政区划名称查询街路巷
     *
     * @param
     */
    @RequestMapping(value = "/findJLXMC")
    public void findJLXMC(String xzqhmc) {
        // 返回 Json
        JSONObject resultJson = new JSONObject();
        try {
            // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
            String param = "xingzhengquhuamingcheng=" + URLEncoder.encode(xzqhmc, "utf-8");
            String lines = HttpRequest.sendGet(HttpRequest.GET_URL_JLXMC, param);
            resultSuccess(resultJson.parse(lines));
        } catch (ConnectException e) {
            e.printStackTrace();
            resultError("500", "调基库连接异常");
        } catch (IOException e) {
            e.printStackTrace();
            resultError("500", "IO异常");
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }
    }

    /**
     * 调 标准地名地址库接口 根据行政区划名称+街路巷 查询门牌号
     *
     * @param xzqhmc 行政区划名称
     * @param jlxmc  街路巷
     * @throws IOException
     */
    @RequestMapping(value = "/findMPHMC")
    public void findMPHMC(String xzqhmc, String jlxmc) {
        log.info("xzqhmc---" + xzqhmc);
        log.info("jlxmc---" + jlxmc);
        // 返回 Json
        JSONObject resultJson = new JSONObject();
        try {
            // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
            String param = "xingzhengquhuamingcheng=" + URLEncoder.encode(xzqhmc, "utf-8") + "&jiedaoxiangmingcheng="
                    + URLEncoder.encode(jlxmc, "utf-8");
            String lines = HttpRequest.sendGet(HttpRequest.GET_URL_MPHMC, param);
            resultSuccess(resultJson.parse(lines));
        } catch (ConnectException e) {
            e.printStackTrace();
            resultError("500", "调基库连接异常");
        } catch (IOException e) {
            e.printStackTrace();
            resultError("500", "IO异常");
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }
    }

    /**
     * 调 标准地名地址库接口 根据行政区划名称+街路巷+门牌号 查询楼栋号
     *
     * @param inputPersonFlow
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(value = "/findLPHMC")
    public void findLPHMC(InputPersonFlow inputPersonFlow) {
        log.info("inputPersonFlow----" + inputPersonFlow);
        log.info("inputPersonFlow.getXzqhmc()----" + inputPersonFlow.getXzqhmc());
        log.info("inputPersonFlow.getJlxmc()----" + inputPersonFlow.getJlxmc());
        log.info("inputPersonFlow.getMphmc()----" + inputPersonFlow.getMphmc());
        log.info("inputPersonFlow.getMphhz()----" + inputPersonFlow.getMphhz());
        try {
            // 返回 Json
            JSONObject resultJson = new JSONObject();
            // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
            String param = "xzqhmc=" + URLEncoder.encode(inputPersonFlow.getXzqhmc(), "utf-8") + "&jlxmc="
                    + URLEncoder.encode(inputPersonFlow.getJlxmc(), "utf-8") + "&mphmc="
                    + URLEncoder.encode(inputPersonFlow.getMphmc(), "utf-8") + "&mphhz="
                    + URLEncoder.encode(inputPersonFlow.getMphhz(), "utf-8");
            String lines = HttpRequest.sendGet(HttpRequest.GET_URL_LPHMC, param);
            // json字符串转换成jsonobject对象
            JSONObject jso = JSON.parseObject(lines);
            JSONArray jsarr = jso.getJSONArray("data");
//             jsonobject对象取得some对应的jsonarray数组
            JSONObject ao = jsarr.getJSONObject(0);
            log.info("jsarr---" + jsarr);
//            if (jsarr.size()==0){
            if (null == ao) {
                JSONObject jObject = new JSONObject();
                JSONObject jObject2 = new JSONObject();
                JSONArray jArray = new JSONArray();
                jObject2.put("loudonghaomingcheng", "0");
                jObject2.put("loudonghaohouzhui", "栋");
                jArray.add(jObject2);
                jObject.put("data", jArray);
                jObject.put("code", "0");
                resultSuccess(jObject);
            } else {
                log.info("lines----" + lines);
                resultSuccess(resultJson.parse(lines));
            }
        } catch (ConnectException e) {
            e.printStackTrace();
            resultError("500", "调基库连接异常");
        } catch (IOException e) {
            e.printStackTrace();
            resultError("500", "IO异常");
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }
    }

    /**
     * 根据用户登录id查询 办事结果 列表
     *
     * @param params userId 登录人id
     */
    @RequestMapping(value = "/queryResultByUserId")
    public void queryResultByUserId(@RequestParam Map<String, Object> params) {
        try {
            log.info("办事结果传入的登录人id---》" + params);
            //根据用户登录id查询办事结果 列表
            List<OutResultList> outResultLists = personFlowService.queryResultByUserId(params);
            resultSuccess(outResultLists);
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库操作异常");
        }

    }
    /**
     * 根据业务id查询和业务类型 办事结果 详情
     *
     * @param outResultList id 业务id（如户籍业务id或流动人口id）(必传)
     *               type 户籍类型 4 夫妻投靠 5 新生儿 6 户籍注销 流动人口类型（1-出租、2-建筑工地人员，3-企业单位）(必传)
     *               policeId 警察id(必传)
     */
    @RequestMapping(value = "/queryResultById")
    public void queryResultById(OutResultList outResultList) {
        try {
            log.info("办事结果传入的业务id---》" + outResultList);
            //根据业务id查询办事详情
            OutResultList outResultList1 = personFlowService.queryResultById(outResultList);
            log.info("办事结果详情---》" + outResultList1);
            resultSuccess2(outResultList1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            resultError("500", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库操作异常");
        }

    }


    /**
     * app端 app首页展示两条工作审批列表
     *
     * @param params policeStation: 所属派出所（必须）
     *               policeOffice: 所属警务室（必须）
     *               policeId ：警察id（必须）
     */
    @RequestMapping(value = "/queryApprovalList")
    public void queryApprovalList(@RequestParam Map<String, Object> params) {
        try {

            //根据警察id查询警察属于哪个审核阶段（不存在一个警察同时在多个不同的审核阶段）
            CensusApprovalSet censusApprovalSet = censusService.queryCensusApprovalSetByPoliceId(params);
            //该警察在审核阶段中，得到该警察的审核阶段
            if (null != censusApprovalSet) {
                params.put("approvalSetLevel", censusApprovalSet.getApprovalSetLevel());
            }
            //查询 审核列表 排序
            List<OutApprovalList> outApprovalLists = personFlowService.queryApprovalList(params);
            log.info("首页工作审核列表---》" + outApprovalLists);
            if (null != outApprovalLists && !outApprovalLists.isEmpty()) {
                for (OutApprovalList outApprovalList : outApprovalLists) {
                    //未审批 ,显示登记时间
                    if (outApprovalList.getApprovalStatus() !=null && 0 == outApprovalList.getApprovalStatus()) {
                        //格式化日期，返回 今天，昨天 其他等日期格式
                        String inputTime = CalendarUtils.formatDateTime(DateUtils.formatDateTime(outApprovalList.getDateInputTime()));
                        outApprovalList.setInputTime(inputTime);
                        //已审批，显示审核时间
                    } else {
                        String approvalTime = CalendarUtils.formatDateTime(DateUtils.formatDateTime(outApprovalList.getDateApprovalTime()));
                        outApprovalList.setApprovalTime(approvalTime);
                    }
                }

            }
            resultSuccess(outApprovalLists);
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库操作异常");
        }

    }

    /**
     * 列表 查询微信端添加的 待审批的流动人口列表
     * parms
     * policeStation: 所属派出所（必传）
     * policeOffice: 所属警务室（必传）
     * timeFlog：申请时间标志 1 一周内 2一个月内
     * "floatingPopulationType":流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
     * "flowWay":流出或者流入类型（1-流入；2-流出）
     * "floatingName":流动人口姓名（模糊搜索）
     */
    @RequestMapping(value = "/queryPersonFlowPendingApproval")
    public void queryPersonFlowPendingApproval(@RequestParam Map<String, Object> params) {
        log.info("流动人口列表查询参数---》" + params);
        try {
            // 返回 Json
            JSONObject resultJson = new JSONObject();
            // 对象 集合
            JSONArray objArray = new JSONArray();
            //获取时间
            GetTime(params);
            Query query = new Query(params);

            //根据所属派出所查询待审批动人口列表
            List<OutPersonFlowApproval> personFlowList = personFlowService.queryPersonFlowPendingApproval(query);
            log.info("OutPersonFlowApproval--->" + personFlowList);

            if (null != personFlowList && !personFlowList.isEmpty()) {
                for (OutPersonFlowApproval personFlow : personFlowList) {
                    //未审批 ,显示登记时间
                    if (personFlow.getApprovalStatus() !=null && 0 == personFlow.getApprovalStatus()) {
                        //格式化日期，返回 今天，昨天 其他等日期格式
                        String inputTime = CalendarUtils.formatDateTime(DateUtils.formatDateTime(personFlow.getDateInputTime()));
                        personFlow.setInputTime(inputTime);

                    }

                    objArray.add(personFlow);
                }
            }
            resultJson.put("objs", objArray);
            resultSuccess(resultJson);

        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库操作异常");
        }
    }
    /**
     * 列表 查询微信端添加的 已审批的流动人口列表
     * parms
     * policeStation: 所属派出所（必传）
     * policeOffice: 所属警务室（必传）
     * timeFlog：申请时间标志 1 一周内 2一个月内
     * "floatingPopulationType":流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
     * "flowWay":流出或者流入类型（1-流入；2-流出）
     * "approvalStatus":审核状态(1驳回,2审核通过)
     * "floatingName":流动人口姓名（模糊搜索）
     */
    @RequestMapping(value = "/queryPersonFlowApprovaled")
    public void queryPersonFlowApprovaled(@RequestParam Map<String, Object> params) {
        log.info("流动人口列表查询参数---》" + params);
        try {
            // 返回 Json
            JSONObject resultJson = new JSONObject();
            // 对象 集合
            JSONArray objArray = new JSONArray();

            //获取时间
            GetTime(params);
            Query query = new Query(params);

            //根据所属派出所查询已审批动人口列表
            List<OutPersonFlowApproval> personFlowList = personFlowService.queryPersonFlowApprovaled(query);
            log.info("OutPersonFlowApproval--->" + personFlowList);

            if (null != personFlowList && !personFlowList.isEmpty()) {
                for (OutPersonFlowApproval personFlow : personFlowList) {
                        //已审批，显示审核时间
                        String approvalTime = CalendarUtils.formatDateTime(DateUtils.formatDateTime(personFlow.getDateApprovalTime()));
                        personFlow.setApprovalTime(approvalTime);
                    objArray.add(personFlow);
                }
            }
            resultJson.put("objs", objArray);
            resultSuccess(resultJson);

        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库操作异常");
        }
    }

    /**
     * 获取时间
     * @param params
     */
    private void GetTime(@RequestParam Map<String, Object> params) {
        //申请时间标志 1 一周内 2一个月内 ‘’ 全部
        String timeFlog = (String)params.get("timeFlog");
        if(null != timeFlog){
            if (!"".equals(timeFlog) && timeFlog.length()!=0) {
                String startTime = DateUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
                //查询时间表示 1 一周内 2一个月内
                String endTime = timeFlog.equals("1") ? DateUtils.getWeekDate() : DateUtils.getMonthDate();
                params.put("startTime",startTime);
                params.put("endTime",endTime);
            }
        }
    }

    /**
     * App端根据警察id和流入流出类型查询流动人口 列表 分页显示
     * id：警员id
     * flowWay:流出或者流入类型（1-流入；2-流出）
     * "floatingPopulationType":流动人口类型（1-出租、2-建筑工地人员，3-企业单位）
     * page 当前页
     * limit 每页条数
     */
    @RequestMapping(value = "/appQueryPersonFlow")
    public void appQueryPersonFlow(@RequestParam Map<String, Object> params) {
        try {
            Query query = new Query(params);

            log.info("警察id--->" + params.get("id"));
            log.info("page--->" + query.getPage());
            log.info("limit--->" + query.getLimit());
            // 返回 Json
            JSONObject resultJson = new JSONObject();
            // 对象 集合
            JSONArray objArray = new JSONArray();
            //App端根据警察id查询流动人口和流动类型查询
            List<OutPersonFlowApproval> appPersonFlowList = personFlowService.appQueryPersonFlow(query);
            log.info("OutPersonFlowApproval--->" + appPersonFlowList);

            if (null != appPersonFlowList && !appPersonFlowList.isEmpty()) {
                for (OutPersonFlowApproval personFlow : appPersonFlowList) {

                    objArray.add(personFlow);
                }
            }
            resultJson.put("objs", objArray);
            resultSuccess(resultJson);
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库操作异常");
        }

    }


    /**
     * 流动人口审批
     * 需要传入警察id
     */
    @RequestMapping(value = "/approvalPersonFlow")
    public void approvalPersonFlow(InputPersonFlow inputPersonFlow) {
        try {
            if (null != inputPersonFlow) {
                if (null == inputPersonFlow.getPoliceId()) {
                    resultError("500", "警察id为空");
                    return;
                }
                //流动人口的id
                if (null != inputPersonFlow.getId()) {
                    PersonFlow personFlow = new PersonFlow(inputPersonFlow);
                    personFlow.setId(inputPersonFlow.getId());
                    //流入时间
                    Date inflowTime = DateUtils.parseDate(inputPersonFlow.getInflowTime());
                    //流出时间
                    Date outflowTime = DateUtils.parseDate(inputPersonFlow.getOutflowTime());
                    personFlow.setInflowTime(inflowTime);
                    personFlow.setOutflowTime(outflowTime);

                    //前科记录
                    personFlow.setCriminalRecord(inputPersonFlow.getCriminalRecord());
                    //修改流动
                    personFlowService.update(personFlow);
                    //根据流动人口id查询审核对象
                    Approval approval2 = approvalService.selectByPersonFlowId(inputPersonFlow.getId());
                    Approval approval = new Approval(inputPersonFlow);
                    //审核时间
                    approval.setApprovalTime(new Date());
                    approval.setId(approval2.getId());

                    //修改审核
                    approvalService.update(approval);
                    resultSuccess();
                } else {
                    resultError("500", "流动人口id为空");
                }
            } else {
                resultError("500", "传参数未空");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }
    }


    /**
     * 发红包
     */
    @RequestMapping(value = "/sendRedPacket")
    public void sendRedPacket(InputPersonFlow inputPersonFlow) {
        try {

            if (null != inputPersonFlow) {
                //流动人口的id
                if (null != inputPersonFlow.getId()) {
                    //根据流动人口id查询审核对象
                    Approval approval2 = approvalService.selectByPersonFlowId(inputPersonFlow.getId());
                    Approval approval = new Approval(inputPersonFlow);
                    approval.setId(approval2.getId());
                    RedPacketAmountSettingEntity redPacketAmountSettingEntity = redPacketAmountSettingService.queryObject(inputPersonFlow.getFloatingPopulationType());
                    if (Integer.valueOf(inputPersonFlow.getRedPacketMoney()) > redPacketAmountSettingEntity.getAmount() ) {
                        resultError("500", "红包金额不能超过设置范围");
                        return;
                    } else {
//                        //测试的weixinId
//                        String weixinId = "ovdF9v5Ck9X-G4pd9OWu0NZmpJ1E";
//                        // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
//                        String param = "openId=" + URLEncoder.encode(weixinId, "utf-8") + "&title="
//                                + URLEncoder.encode(inputPersonFlow.getLeaveMessage(), "utf-8")+"&count="
//                                + URLEncoder.encode(inputPersonFlow.getRedPacketMoney(), "utf-8");

                        //部署到外网公众号时候，获得的微信id
                        //根据登录人id查询
                        log.info("userId--->" + inputPersonFlow.getUserId());
                        User user = userService.selectById(inputPersonFlow.getUserId());
                        String openId = "";
                        if (null != user) {
                            openId = user.getWeixinId();
                            log.info("openId--->" + openId);
                            if(StringUtils.isBlank(openId)){
                                resultError("500", "微信的openId为空 ");
                                return;
                            }
                        } else {
                            resultError("500", "微信的openId为空 ");
                            return;
                        }
                        // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
                        String param = "openId=" + URLEncoder.encode(openId, "utf-8") + "&title="
                                + URLEncoder.encode(inputPersonFlow.getLeaveMessage(), "utf-8") + "&count="
                                + URLEncoder.encode(inputPersonFlow.getRedPacketMoney(), "utf-8");

                        String lines = HttpRequest.sendGet(HttpRequest.GET_URL_REDPACKET + "send", param);
                        // json字符串转换成jsonobject对象
                        JSONObject jso = JSON.parseObject(lines);
                        String status = (String) jso.get("status");
                        String msg_content = (String) jso.get("msg_content");
                        //发红包成功 status=0
                        if (status.equals("0")) {
                            //修改审核信息
                            approvalService.update(approval);

                            //插入红包发送日志
                            RedPacketSendLogEntity redPacketSendLogEntity = new RedPacketSendLogEntity();
                            redPacketSendLogEntity.setRedPacketAmount(inputPersonFlow.getRedPacketMoney());
                            redPacketSendLogEntity.setUserName(user.getUserName());
                            Police police = policeService.selectById(approval.getPoliceId());
                            if (police!=null) {
                                redPacketSendLogEntity.setPoliceName(police.getPoliceName());
                            }
                            redPacketSendLogEntity.setSendTime(new Date());
                            redPacketSendLogService.save(redPacketSendLogEntity);
                            //返回状态
                            resultSuccess();
                        } else {
                            resultError("500", msg_content);
                        }
                    }
                } else {
                    resultError("500", "流动人口id为空");
                }
            } else {
                resultError("500", "传参数未空");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }

    }


    /**
     * 根据id查看流动人口审批 详情
     */
    @RequestMapping(value = "/queryPersonFlowById")
    public void queryPersonFlowById(InputPersonFlow inputPersonFlow) {
        try {
            if (null != inputPersonFlow) {
                //根据id查看流动人口审批详情
                OutPersonFlowApproval outPersonFlowApproval = personFlowService.selectByPersonFlowId(inputPersonFlow.getId());
                if (null != outPersonFlowApproval) {
                    //相片
                    if (null != outPersonFlowApproval.getPhotographs()) {
                        String[] photos = outPersonFlowApproval.getPhotographs().split(",");
                        outPersonFlowApproval.setPhotos(photos);
                    }
                    if (null != outPersonFlowApproval.getApprovalStatus()) {
                        //审核状态(0未审核，1驳回,2审核通过)
                        if (0 != outPersonFlowApproval.getApprovalStatus()) {
                            //根据警察id查询警员信息
                            Police polic = personFlowService.selectByPoliceId(outPersonFlowApproval.getPoliceId());
                            outPersonFlowApproval.setPoliceName(polic.getPoliceName());
                            outPersonFlowApproval.setPoliceNumber(polic.getPoliceNumber());
                        }
                    }

                }
                resultSuccess(outPersonFlowApproval);
            } else {
                resultError("500", "参数为空");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "参数为空");
        }
    }

    /**
     * 图片上传 并返回 图片名
     *
     * @param myfile
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/fileToUpload")
    public String fileToUpload(@RequestParam(value = "file", required = false) MultipartFile myfile) {
        System.out.println("-------myfile:" + myfile);
        /** 得到文件保存目录的真实路径* */
        String logoRealPathDir = request.getSession().getServletContext().getRealPath("/upload") + File.separator
                + DateUtils.getDate("yyyyMMdd");
        /** 根据真实路径创建目录* */
        File logoSaveFile = new File(logoRealPathDir);
        if (!logoSaveFile.exists())
            logoSaveFile.mkdirs();
        /** 获取文件的后缀* */
        String suffix = myfile.getOriginalFilename().substring(myfile.getOriginalFilename().lastIndexOf("."));
        /** 使用UUID生成文件名称* */
        // String logImageName = UUID.randomUUID().toString() + suffix;// 构建文件名称
        // 时间戳 文件名
        String logImageName = new Date().getTime() + suffix;

        /** 拼成完整的文件保存路径加文件* */
        // String filePath = logoRealPathDir + File.separator +
        // myfile.getOriginalFilename();
        String filePath = logoRealPathDir + File.separator + logImageName;
        // 上传
        File file = new File(filePath);
        try {
            myfile.transferTo(file);
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }

        /** 拼接上传日志信息 */
        String upload_address = DateUtils.getDate("yyyyMMdd") + "/" + logImageName;
        log.info("完整的文件保存路径加文件filePath--" + filePath);
        log.info("upload_address--" + upload_address);
        return upload_address;
    }

}