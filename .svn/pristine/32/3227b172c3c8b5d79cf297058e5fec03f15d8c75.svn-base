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

import com.ehootu.sys.entity.RedPacketAmountSettingEntity;
import com.ehootu.sys.service.RedPacketAmountSettingService;





/**
 * 红包金额设置
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-03-05 14:40:03
 */
@RestController
@RequestMapping("/sys/redpacketamountsetting")
public class RedPacketAmountSettingController {
	@Autowired
	private RedPacketAmountSettingService redPacketAmountSettingService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:redpacketamountsetting:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<RedPacketAmountSettingEntity> redPacketAmountSettingList = redPacketAmountSettingService.queryList(query);
		int total = redPacketAmountSettingService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(redPacketAmountSettingList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sys:redpacketamountsetting:info")
	public R info(@PathVariable("id") Integer id){
		RedPacketAmountSettingEntity redPacketAmountSetting = redPacketAmountSettingService.queryObject(id);
		
		return R.ok().put("redPacketAmountSetting", redPacketAmountSetting);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:redpacketamountsetting:save")
	public R save(@RequestBody RedPacketAmountSettingEntity redPacketAmountSetting){
		redPacketAmountSettingService.save(redPacketAmountSetting);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:redpacketamountsetting:update")
	public R update(@RequestBody RedPacketAmountSettingEntity redPacketAmountSetting){
		redPacketAmountSettingService.update(redPacketAmountSetting);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:redpacketamountsetting:delete")
	public R delete(@RequestBody Integer[] ids){
		redPacketAmountSettingService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
