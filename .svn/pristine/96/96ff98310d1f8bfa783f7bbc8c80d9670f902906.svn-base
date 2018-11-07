package com.ehootu.rural.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.rural.model.PeaceWorkEntity;
import com.ehootu.rural.service.PeaceWorkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 治安重点工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:02
 */
@RestController
@RequestMapping("/app/peacework")
public class PeaceWorkController extends BaseController {
	@Autowired
	private PeaceWorkService peaceWorkService;
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
		List<PeaceWorkEntity> patrolRecordList = peaceWorkService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 治安重点工作记录表主键id
	 */
	@RequestMapping("/info")
	@ResponseBody
	public void info(String id){
		PeaceWorkEntity peaceWork = peaceWorkService.queryObject(id);

		resultSuccess(peaceWork);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(PeaceWorkEntity peaceWork, PublicInformationEntity publicInformation, String pageName){
		peaceWorkService.save(peaceWork, publicInformation, pageName);
		resultSuccess();
	}

	/**
	 * 治安重点工作记录：查询 管理项目 类型列表
	 */
	@RequestMapping("/glxm")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.ZAZDGZJL_GLXM);
		resultSuccess(list);
	}

	/**
	 * 治安重点工作记录：查询 检查方式 类型列表
	 */
	@RequestMapping("/jcfs")
	@ResponseBody
	public void queryTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.ZAZDGZJL_JCFS);
		resultSuccess(list);
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("peacework:update")
	public R update(@RequestBody PeaceWorkEntity peaceWork){
		peaceWorkService.update(peaceWork);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("peacework:delete")
	public R delete(@RequestBody Integer[] ids){
		peaceWorkService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
