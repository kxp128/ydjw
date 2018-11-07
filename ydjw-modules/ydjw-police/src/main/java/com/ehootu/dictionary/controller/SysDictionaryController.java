package com.ehootu.dictionary.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.PageUtils;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Liaoxb
 * @date 2017/12/1
 */
@RestController
@RequestMapping("dictionary")
public class SysDictionaryController extends BaseController {
    private static Logger _log = LoggerFactory.getLogger(SysDictionaryController.class);

	@Autowired
	private SysDictionaryService sysDictionaryService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("controlwork:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);

		List<SysDictionary> controlWorkList = sysDictionaryService.queryList(query);
		int total = sysDictionaryService.queryTotal(query);

		PageUtils pageUtil = new PageUtils(controlWorkList, total, query.getLimit(), query.getPage());

		return R.ok().put("page", pageUtil);
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("controlwork:info")
	public R info(@PathVariable("id") String id){
		SysDictionary controlWork = sysDictionaryService.queryObject(id);

		return R.ok().put("controlWork", controlWork);
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("controlwork:save")
	public R save(@RequestBody SysDictionary controlWork){
		sysDictionaryService.save(controlWork);

		return R.ok();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("controlwork:update")
	public R update(@RequestBody SysDictionary controlWork){
		sysDictionaryService.update(controlWork);

		return R.ok();
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("controlwork:delete")
	public R delete(@RequestBody Integer[] ids){
		sysDictionaryService.deleteBatch(ids);

		return R.ok();
	}

	/**
	 * 根据类型和值，获取 SysDictionary 实体
	 * @param type 类型
	 * @param value 值
	 * @return
	 */
	@RequestMapping("/getSysDictionary")
	@ResponseBody
	public SysDictionary getSysDictionary(String type, String value){
		return sysDictionaryService.getSysDictionary(type, value);
	}
	/**
	 * 根据 type 查询类型list
	 * @param type 类型
	 * @return
	 */
	@RequestMapping("/typeList")
	@ResponseBody
	public List<SysDictionary> selectListByType(String type){
		return sysDictionaryService.selectListByType(type);
	}
}
