package com.ehootu.flow.service;

import com.ehootu.core.generic.GenericService;
import com.ehootu.flow.model.Approval;
import com.ehootu.flow.model.OutPersonFlowApproval;

import java.util.List;

/**
 * @Title:ApprovalService
 * @Author: KongXiaoPing
 * @Date: 2017-09-21 16:02
 * @Description: 审核服务接口
 */
public interface ApprovalService extends GenericService<Approval, String> {
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
