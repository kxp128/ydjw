package com.ehootu.flow.service.impl;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.generic.GenericServiceImpl;
import com.ehootu.flow.dao.ApprovalMapper;
import com.ehootu.flow.model.Approval;
import com.ehootu.flow.model.OutPersonFlowApproval;
import com.ehootu.flow.service.ApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title:ApprovalServiceImpl
 * @Author: KongXiaoPing
 * @Date: 2017-09-21 16:03
 * @Description:
 */
@Service
public class ApprovalServiceImpl extends GenericServiceImpl<Approval, String> implements ApprovalService {
    @Autowired
    private ApprovalMapper approvalMapper;

    @Override
    public GenericDao<Approval, String> getDao() {
        return approvalMapper;
    }

    @Override
    public List<OutPersonFlowApproval> queryApprovalByUserId(String userId) {

        return approvalMapper.queryApprovalByUserId(userId);
    }

    @Override
    public Approval selectByPersonFlowId(String id) {
        return approvalMapper.selectByPersonFlowId(id);
    }
}