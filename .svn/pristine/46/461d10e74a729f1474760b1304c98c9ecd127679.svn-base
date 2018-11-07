package com.ehootu.census.dao;

import com.ehootu.census.model.CensusRegister;
import com.ehootu.census.model.CensusRegisterExample;
import com.ehootu.census.model.OutCensus;
import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.util.Query;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CensusRegisterMapper extends GenericDao<CensusRegister,Integer> {
    long countByExample(CensusRegisterExample example);

    int deleteByExample(CensusRegisterExample example);

    int deleteByPrimaryKey(String id);

    int insert(CensusRegister record);

    int insertSelective(CensusRegister record);

    List<CensusRegister> selectByExample(CensusRegisterExample example);

    CensusRegister selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CensusRegister record, @Param("example") CensusRegisterExample example);

    int updateByExample(@Param("record") CensusRegister record, @Param("example") CensusRegisterExample example);

    int updateByPrimaryKeySelective(CensusRegister record);

    int updateByPrimaryKey(CensusRegister record);
    /**
     *  户籍待审批条件查询 分页列表展示
     * @param query
     * @return
     */
    List<OutCensus> queryCensusPendingApproval(Query query);
    /**
     * 根据户籍id查看详情
     *
     * @param params 户籍id
     */
    OutCensus queryCensusById(Map<String, Object> params);
    /**
     *  户籍已审批条件查询 分页列表展示
     * @param query
     * @return
     */
    List<OutCensus> queryCensusApprovaled(Query query);


    /**
     * pc端 根据审核阶段approvalStage=0查询 微信端添加的 户籍列表 分页
     * @param query
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