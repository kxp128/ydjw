package com.ehootu.flow.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.flow.model.RiskAssessmentEntity;
import com.ehootu.flow.service.RiskAssessmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 工程项目风险评估
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 15:10:26
 */
@RestController
@RequestMapping("/app/riskassessment")
public class RiskAssessmentController extends BaseController {
	@Autowired
	private RiskAssessmentService riskAssessmentService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<RiskAssessmentEntity> aidWorkRecord = riskAssessmentService.queryList(query);
		resultSuccess(aidWorkRecord);
	}


	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		RiskAssessmentEntity riskAssessment = riskAssessmentService.queryObject(id);
		resultSuccess(riskAssessment);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(RiskAssessmentEntity riskAssessment, String pageName){
		riskAssessmentService.save(riskAssessment, pageName);
		resultSuccess();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("riskassessment:update")
	public R update(@RequestBody RiskAssessmentEntity riskAssessment){
		riskAssessmentService.update(riskAssessment);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("riskassessment:delete")
	public R delete(@RequestBody Integer[] ids){
		riskAssessmentService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
