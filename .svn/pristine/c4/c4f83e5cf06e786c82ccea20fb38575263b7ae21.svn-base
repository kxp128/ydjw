package com.ehootu.flow.dao;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.util.Query;
import com.ehootu.flow.model.OutApprovalList;
import com.ehootu.flow.model.OutPersonFlowApproval;
import com.ehootu.flow.model.OutResultList;
import com.ehootu.flow.model.PersonFlow;
import com.ehootu.flow.model.PersonFlowExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 流动人口业务dao层
 */
@Repository
public interface PersonFlowMapper extends GenericDao<PersonFlow, String> {
    long countByExample(PersonFlowExample example);

    int deleteByExample(PersonFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(PersonFlow record);

    int insertSelective(PersonFlow record);

    List<PersonFlow> selectByExample(PersonFlowExample example);

    PersonFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PersonFlow record, @Param("example") PersonFlowExample example);

    int updateByExample(@Param("record") PersonFlow record, @Param("example") PersonFlowExample example);

    int updateByPrimaryKeySelective(PersonFlow record);

    int updateByPrimaryKey(PersonFlow record);
    /**
     * 根据所属派出所查询待审批动人口列表
     * @param query inputPersonFlow 查询 参数
     * @return 流动人口列表
     */
    List<OutPersonFlowApproval> queryPersonFlowPendingApproval(Query query);

    /**
     * 根据所属派出所查询已审批动人口列表
     * @param query
     * @return
     */
    List<OutPersonFlowApproval> queryPersonFlowApprovaled(Query query);

    /**
     * 根据流动人口id查询
     * @param id
     * @return
     */
    OutPersonFlowApproval selectByPersonFlowId(String id);
    /**
     * 根据警察id查询流动人口列表 分页
     * @param map policeId
     * @return
     */
    List<OutPersonFlowApproval> appQueryPersonFlow(Map<String, Object> map);
    /**
     * 查询 审核列表 排序
     * @param params
     * @return
     */
    List<OutApprovalList> queryApprovalList(Map<String, Object> params);
    /**
     * 根据用户登录id查询办事结果 列表
     * @param params
     * @return
     */
    List<OutResultList> queryResultByUserId(Map<String, Object> params);

    /**
     * 根据流动人口id查询
     * @param id
     * @return
     */
    OutPersonFlowApproval queryPersonFlowById(String id);
}