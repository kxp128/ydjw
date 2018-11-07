package com.ehootu.rural.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.rural.model.SecurityCheckEntity;
import com.ehootu.rural.service.SecurityCheckService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 村社消防安全检查记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:17
 */
@RestController
@RequestMapping("/app/securitycheck")
public class SecurityCheckController extends BaseController {
	@Autowired
	private SecurityCheckService securityCheckService;
	@Autowired
	private SysDictionaryService dictionaryService;


	/**
	 * 列表
	 * @param params policeId 警察id
	 * @param params page 当前页码
	 * @param params pageSize 每页显示条数
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<SecurityCheckEntity> patrolRecordList = securityCheckService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 村社消防安全检查记录表主键id
	 */
	@RequestMapping("/info")
	@ResponseBody
	public void info(String id){
		SecurityCheckEntity securityCheck = securityCheckService.queryObject(id);

		resultSuccess(securityCheck);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(SecurityCheckEntity securityCheck, PublicInformationEntity publicInformation, String pageName){
		securityCheckService.save(securityCheck, publicInformation,pageName);
		resultSuccess();
	}

	/**
	 * 村社消防安全检查记录：查询 检查场所 类型列表
	 */
	@RequestMapping("/jccs")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.CSXFAQJCJL_JCCS);
		resultSuccess(list);
	}

	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("securitycheck:update")
	public R update(@RequestBody SecurityCheckEntity securityCheck){
		securityCheckService.update(securityCheck);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("securitycheck:delete")
	public R delete(@RequestBody Integer[] ids){
		securityCheckService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
