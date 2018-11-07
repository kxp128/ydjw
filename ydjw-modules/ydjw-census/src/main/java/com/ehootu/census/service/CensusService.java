package com.ehootu.census.service;

import com.ehootu.census.model.CensusApproval;
import com.ehootu.census.model.CensusApprovalSet;
import com.ehootu.census.model.InputCensus;
import com.ehootu.census.model.OutCensus;
import com.ehootu.core.util.Query;

import java.util.List;
import java.util.Map;

/**
 * @Title:CensusService
 * @Author: KongXiaoPing
 * @Date: 2017-12-29 11:31
 * @Description: 户籍业务服务接口
 */
public interface CensusService {
    /**
     * 添加户籍
     * @param inputCensus
     */
    void saveCensus(InputCensus inputCensus) throws Exception;



    /**
     *  //查询警察属于哪个审核阶段（不存在一个警察同时在多个不同的审核阶段）
     * @param params  警察id
     * @return 审核流程表
     */
    CensusApprovalSet queryCensusApprovalSetByPoliceId(Map<String, Object> params);
    /**
     * 根据户籍id查看详情
     *
     * @param params 户籍id
     */
    OutCensus queryCensusById(Map<String, Object> params);



//    /**
//     * 根据审核id查询修改审核
//     * @param approval
//     */
//    void updateCensusApproval(CensusApproval approval);

    /**
     * 列表 查询待审批的微信端添加的 户籍列表 分页
     * @param params
     * @return
     */
    List<OutCensus> queryCensusPendingApproval(Map<String, Object> params);

    /**
     * 列表 查询微信端添加的  已审批的户籍列表 分页
     * @param params
     * @return
     */
    List<OutCensus> queryCensusApprovaled(Map<String, Object> params);

    /**
     * 添加户籍审批
     * @param approval
     */
    void addCensusApproval(CensusApproval approval);

    /**
     * 根据户籍id 和审核阶段当前审核阶段(0户政大厅，1治安大队,2领导)查询审核对象
     * @param id
     * @return
     */
    CensusApproval selectByCensusId(InputCensus inputCensus);

    /**
     * 修改户籍审核
     * @param approval
     */
    void updateCensusApproval(CensusApproval approval);

    /**
     * pc端 根据审核阶段approvalStage=0查询 微信端添加的 户籍列表 分页
     * @param params
     * @return
     */
    List<OutCensus> queryCensusApprovalByPC(Query query);

    /**
     * 总页数
     * @param query
     * @return
     */
    int queryCensusApprovalTotal(Query query);

    /**
     * 微信服务号个人办事结果 条件查询户籍审批详情
     * @param map
     * @return
     */
    OutCensus queryCensusDetail(Map<String, Object> map);
}
