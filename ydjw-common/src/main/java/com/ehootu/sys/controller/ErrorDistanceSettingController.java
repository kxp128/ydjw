package com.ehootu.sys.controller;

import java.util.List;
import java.util.Map;

import com.ehootu.core.util.PageUtils;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehootu.sys.entity.ErrorDistanceSettingEntity;
import com.ehootu.sys.service.ErrorDistanceSettingService;





/**
 * 误差距离设置
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-03-05 14:40:03
 */
@RestController
@RequestMapping("/sys/errordistancesetting")
public class ErrorDistanceSettingController {
	@Autowired
	private ErrorDistanceSettingService errorDistanceSettingService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:errordistancesetting:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<ErrorDistanceSettingEntity> errorDistanceSettingList = errorDistanceSettingService.queryList(query);
		int total = errorDistanceSettingService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(errorDistanceSettingList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sys:errordistancesetting:info")
	public R info(@PathVariable("id") Integer id){
		ErrorDistanceSettingEntity errorDistanceSetting = errorDistanceSettingService.queryObject(id);
		
		return R.ok().put("errorDistanceSetting", errorDistanceSetting);
	}

	@RequestMapping("/ginfo/{id}")
	public R getInfo(@PathVariable("id") Integer id){
		ErrorDistanceSettingEntity errorDistanceSetting = errorDistanceSettingService.queryObject(id);

		return R.ok().put("errorDistanceSetting", errorDistanceSetting);
	}
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:errordistancesetting:save")
	public R save(@RequestBody ErrorDistanceSettingEntity errorDistanceSetting){
		errorDistanceSettingService.save(errorDistanceSetting);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:errordistancesetting:update")
	public R update(@RequestBody ErrorDistanceSettingEntity errorDistanceSetting){
		errorDistanceSettingService.update(errorDistanceSetting);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:errordistancesetting:delete")
	public R delete(@RequestBody Integer[] ids){
		errorDistanceSettingService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
