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

import com.ehootu.sys.entity.DmdzEntity;
import com.ehootu.sys.service.DmdzService;

/**
 * 
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-25 17:07:18
 */
@RestController
@RequestMapping("/sys/dmdz")
public class DmdzController {
	@Autowired
	private DmdzService dmdzService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:dmdz:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<DmdzEntity> dmdzList = dmdzService.queryList(query);
		int total = dmdzService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(dmdzList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{dmdzId}")
	@RequiresPermissions("sys:dmdz:info")
	public R info(@PathVariable("dmdzId") Integer dmdzId){
		DmdzEntity dmdz = dmdzService.queryObject(dmdzId);
		
		return R.ok().put("dmdz", dmdz);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:dmdz:save")
	public R save(@RequestBody DmdzEntity dmdz){
		dmdzService.save(dmdz);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:dmdz:update")
	public R update(@RequestBody DmdzEntity dmdz){
		dmdzService.update(dmdz);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:dmdz:delete")
	public R delete(@RequestBody Integer[] dmdzIds){
		dmdzService.deleteBatch(dmdzIds);
		return R.ok();
	}
	
}
