package com.ehootu.flow.dao;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.flow.model.Approval;
import com.ehootu.flow.model.ApprovalExample;
import com.ehootu.flow.model.OutPersonFlowApproval;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprovalMapper extends GenericDao<Approval, String> {
    long countByExample(ApprovalExample example);

    int deleteByExample(ApprovalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Approval record);

    int insertSelective(Approval record);

    List<Approval> selectByExample(ApprovalExample example);

    Approval selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByExample(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByPrimaryKeySelective(Approval record);

    int updateByPrimaryKey(Approval record);
    /**
     * 根据用户id查询审核结果 按登记时间降序排列
     * @param userId 用户id
     */
    List<OutPersonFlowApproval> queryApprovalByUserId(String userId);
    /**
     * 根据流动人口id查询审核对象
     * @param id
     * @return
     */
    Approval selectByPersonFlowId(String id);
}