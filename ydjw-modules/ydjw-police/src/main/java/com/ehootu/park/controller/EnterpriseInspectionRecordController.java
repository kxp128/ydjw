package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.EnterpriseInspectionRecordEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.EnterpriseInspectionRecordService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 企业内保工作检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:18
 */
@RestController
@RequestMapping("/app/enterpriseinspectionrecord")
public class EnterpriseInspectionRecordController extends BaseController {
	@Autowired
	private EnterpriseInspectionRecordService enterpriseInspectionRecordService;
	@Autowired
	private SysDictionaryService dictionaryService;


	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<EnterpriseInspectionRecordEntity> enterpriseInspectionRecordList = enterpriseInspectionRecordService.queryList(query);
		resultSuccess(enterpriseInspectionRecordList);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		EnterpriseInspectionRecordEntity enterpriseInspectionRecord = enterpriseInspectionRecordService.queryObject(id);
		resultSuccess(enterpriseInspectionRecord);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		EnterpriseInspectionRecordEntity enterpriseInspectionRecord = input.getEnterpriseInspectionRecord();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	enterpriseInspectionRecordService.save(enterpriseInspectionRecord, publicInformation, pageName);
		resultSuccess();
	}

	/**
	 * 企业内保工作检查记录：查询 检查类别 类型列表
	 */
	@RequestMapping("/jclb")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.QYNB_JCLB);
		resultSuccess(list);
	}

	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	public void update(EnterpriseInspectionRecordEntity enterpriseInspectionRecord){
		enterpriseInspectionRecordService.update(enterpriseInspectionRecord);
		resultSuccess();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("enterpriseinspectionrecord:delete")
	public R delete(@RequestBody Integer[] ids){
		enterpriseInspectionRecordService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
