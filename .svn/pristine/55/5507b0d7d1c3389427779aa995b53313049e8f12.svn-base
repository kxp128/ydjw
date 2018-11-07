package com.ehootu.census.service.impl;

import com.ehootu.census.dao.CensusApprovalMapper;
import com.ehootu.census.dao.CensusApprovalSetMapper;
import com.ehootu.census.dao.CensusRegisterAttachmentMapper;
import com.ehootu.census.dao.CensusRegisterMapper;
import com.ehootu.census.model.CensusApproval;
import com.ehootu.census.model.CensusApprovalSet;
import com.ehootu.census.model.CensusRegister;
import com.ehootu.census.model.CensusRegisterAttachment;
import com.ehootu.census.model.InputCensus;
import com.ehootu.census.model.OutCensus;
import com.ehootu.census.service.CensusService;
import com.ehootu.core.util.CalendarUtils;
import com.ehootu.core.util.DateUtils;
import com.ehootu.core.util.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Title:CensusServiceImpl
 * @Author: KongXiaoPing
 * @Date: 2017-12-29 11:34
 * @Description:
 */
@Service
public class CensusServiceImpl implements CensusService {
    private final static Logger log = LoggerFactory.getLogger(CensusServiceImpl.class);
    @Autowired
    private CensusRegisterMapper censusRegisterMapper;
    @Autowired
    private CensusRegisterAttachmentMapper censusRegisterAttachmentMapper;
    @Autowired
    private CensusApprovalSetMapper censusApprovalSetMapper;
    @Autowired
    private CensusApprovalMapper censusApprovalMapper;


    @Override
    public void saveCensus(InputCensus inputCensus) throws Exception{

        try {
            CensusRegisterAttachment censusRegisterAttachment = new CensusRegisterAttachment(inputCensus);
            CensusRegister censusRegister = new CensusRegister(inputCensus);
            log.info("添加之前附件id--》" + censusRegisterAttachment.getId());
            //添加附件
            censusRegisterAttachmentMapper.insertSelective(censusRegisterAttachment);
            log.info("添加之后附件id--》" + censusRegisterAttachment.getId());
            censusRegister.setAttachmentId(censusRegisterAttachment.getId());
            //提交时间
            censusRegister.setSubmitTime(new Date());
            log.info("添加之前户籍id--》" + censusRegister.getId());
            //添加户籍
            censusRegisterMapper.insertSelective(censusRegister);
            log.info("添加之后户籍id--》" + censusRegister.getId());

            CensusApproval approval = new CensusApproval(inputCensus);
            //户籍id
            approval.setCensusRegisterId(censusRegister.getId());
            //审核阶段(0户政大厅，1治安大队,2领导)
            approval.setApprovalStage(0);
            //受理编号
            approval.setAcceptNumber(DateUtils.formatDate(new Date(), "yyyyMMddHHmmss"));
            //审核状态(0未审核，1驳回,2审核通过)
            approval.setApprovalStatus(0);
            //添加户籍审批
            censusApprovalMapper.insertSelective(approval);
        } catch (Exception e) {
            throw new Exception();
        }

    }

    @Override
    public CensusApprovalSet queryCensusApprovalSetByPoliceId(Map<String, Object> params) {
        return censusApprovalSetMapper.queryCensusApprovalSetByPoliceId(params);
    }

    @Override
    public OutCensus queryCensusById(Map<String, Object> params) {
        return censusRegisterMapper.queryCensusById(params);
    }

    /**
     *    app端待审批 列表查询
     * @param params
     * @return
     */
    @Override
    public List<OutCensus> queryCensusPendingApproval(Map<String, Object> params) {
        List<OutCensus> censusRegisterList = new ArrayList<>();
        if (null != params.get("timeFlog")) {
            String inputStartTime = DateUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
            //查询时间表示 1 一周内 2一个月内
            String inputEndTime = params.get("timeFlog").equals("1") ? DateUtils.getWeekDate() : DateUtils.getMonthDate();
            //登记开始时间
            params.put("inputStartTime", inputStartTime);
            //登记结束时间
            params.put("inputEndTime", inputEndTime);

        }
        //根据警察id查询警察属于哪个审核阶段（不存在一个警察同时在多个不同的审核阶段）
        CensusApprovalSet censusApprovalSet = censusApprovalSetMapper.queryCensusApprovalSetByPoliceId(params);

        //该警察在审核阶段中，得到该警察的审核阶段
        if (null != censusApprovalSet) {
            //设置阶段为
            params.put("approvalStage", censusApprovalSet.getApprovalSetLevel());
        } else {
            //返回一个空数组 {"result":[],"status":0}
            return censusRegisterList;
        }

        Query query = new Query(params);
        //根据审核阶段查询该警察对应的户籍审核列表 分页列表展示
        censusRegisterList = censusRegisterMapper.queryCensusPendingApproval(query);
        log.info("OutCensus--->" + censusRegisterList);
        if (null != censusRegisterList && !censusRegisterList.isEmpty()) {
            for (OutCensus censusRegister : censusRegisterList) {
                //待审批 ,显示登记时间    格式化日期，返回 今天，昨天 其他等日期格式
                String inputTime = CalendarUtils.formatDateTime(DateUtils.formatDateTime(censusRegister.getSubmitTime()));
                censusRegister.setInputTime(inputTime);
            }
        }
        return censusRegisterList;
    }

    /**
     * app端已审批列表查询
     * @param params
     * @return
     */
    @Override
    public List<OutCensus> queryCensusApprovaled(Map<String, Object> params) {
        List<OutCensus> censusRegisterList = new ArrayList<>();
        if (null != params.get("timeFlog")) {
            String approvalStartTime = DateUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
            //timeFlog查询时间表示 1 一周内 2一个月内
            String approvalEndTime = params.get("timeFlog").equals("1") ? DateUtils.getWeekDate() : DateUtils.getMonthDate();
            //审核开始时间
            params.put("approvalStartTime", approvalStartTime);
            //审核结束时间
            params.put("approvalEndTime", approvalEndTime);
        }
        Query query = new Query(params);
        //条件查询已审批户籍
        censusRegisterList = censusRegisterMapper.queryCensusApprovaled(query);
        log.info("OutCensus--->" + censusRegisterList);
        if (null != censusRegisterList && !censusRegisterList.isEmpty()) {
            for (OutCensus censusRegister : censusRegisterList) {
                //已审批，显示审核时间
                String approvalTime = CalendarUtils.formatDateTime(DateUtils.formatDateTime(censusRegister.getDateApprovalTime()));
                censusRegister.setApprovalTime(approvalTime);
            }
        }
        return censusRegisterList;
    }


    @Override
    public void addCensusApproval(CensusApproval approval) {
        censusApprovalMapper.insertSelective(approval);
    }


    @Override
    public CensusApproval selectByCensusId(InputCensus inputCensus) {
        return censusApprovalMapper.selectByCensusId(inputCensus);
    }

    @Override
    public void updateCensusApproval(CensusApproval approval) {
        censusApprovalMapper.updateByPrimaryKeySelective(approval);
    }

    @Override
    public List<OutCensus> queryCensusApprovalByPC(Query query) {
        return censusRegisterMapper.queryCensusApprovalByPC(query);
    }

    @Override
    public int queryCensusApprovalTotal(Query query) {
        return censusRegisterMapper.queryCensusApprovalTotal(query);
    }

    @Override
    public OutCensus queryCensusDetail(Map<String, Object> map) {
        return censusRegisterMapper.queryCensusDetail(map);
    }
}