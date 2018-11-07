package com.ehootu.rural.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.rural.model.SocialWorkRecordEntity;
import com.ehootu.rural.service.SocialWorkRecordService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 社情民意工作记录
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 14:28:31
 */
@RestController
@RequestMapping("app/socialWorkRecord")
public class SocialWorkRecordController extends BaseController {
	@Autowired
	private SocialWorkRecordService socialWorkRecordService;
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
		List<SocialWorkRecordEntity> patrolRecordList = socialWorkRecordService.queryList(query);
		resultSuccess(patrolRecordList);
	}


	/**
	 * 根据主键 id 查询详细信息
	 * @param id 社情民意工作记录表主键id
	 */
	@RequestMapping("/info")
	@ResponseBody
	public void info(String id){
		SocialWorkRecordEntity socialWorkRecord = socialWorkRecordService.queryObject(id);

		resultSuccess(socialWorkRecord);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(SocialWorkRecordEntity socialWorkRecord, String pageName){
		socialWorkRecordService.save(socialWorkRecord, pageName);
		resultSuccess();
	}

	/**
	 * 社情民意工作记录：查询 调查项目 类型列表
	 */
	@RequestMapping("/dcxm")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.SQMYDCGL_DCXM);
		resultSuccess(list);
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("socialworkrecord:update")
	public R update(@RequestBody SocialWorkRecordEntity socialWorkRecord){
		socialWorkRecordService.update(socialWorkRecord);

		return R.ok();
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("socialworkrecord:delete")
	public R delete(@RequestBody Integer[] ids){
		socialWorkRecordService.deleteBatch(ids);

		return R.ok();
	}

}
