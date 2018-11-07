package com.ehootu.flow.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ehootu.core.generic.BaseController;
import com.ehootu.flow.model.OutPersonFlowApproval;
import com.ehootu.flow.service.ApprovalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Title:ApprovalController
 * @Author: KongXiaoPing
 * @Date: 2017-09-21 11:55
 * @Description: 审核控制器
 */
@Controller
@RequestMapping(value = "/approval")
public class ApprovalController extends BaseController {
    private final static Logger log = LoggerFactory.getLogger(ApprovalController.class);
    @Autowired
    private ApprovalService approvalService;

    /**
     * 根据用户id查询审核结果 按登记时间降序排列
     *
     * @param userId 用户id
     */
    @RequestMapping(value = "/queryApproval")
    public void queryApprovalByUserId(String userId) {
        // 返回 Json
        JSONObject resultJson = new JSONObject();
        // 对象 集合
        JSONArray objArray = new JSONArray();
        try {
            List<OutPersonFlowApproval> outPersonFlowApprovals = approvalService.queryApprovalByUserId(userId);
            if (null != outPersonFlowApprovals || outPersonFlowApprovals.size() > 0) {
                for (OutPersonFlowApproval personFlowApproval : outPersonFlowApprovals) {
                    objArray.add(personFlowApproval);
                }
                resultJson.put("objs", objArray);
                resultSuccess(resultJson);
            } else {
                resultError("1", "没有办理事项");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultError("500", "数据库异常");
        }

    }

}