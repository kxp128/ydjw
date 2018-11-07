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

import com.ehootu.sys.entity.RedPacketSendLogEntity;
import com.ehootu.sys.service.RedPacketSendLogService;




/**
 * 红包发送记录
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-03-05 14:40:02
 */
@RestController
@RequestMapping("/sys/redpacketsendlog")
public class RedPacketSendLogController {
	@Autowired
	private RedPacketSendLogService redPacketSendLogService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:redpacketsendlog:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<RedPacketSendLogEntity> redPacketSendLogList = redPacketSendLogService.queryList(query);
		int total = redPacketSendLogService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(redPacketSendLogList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sys:redpacketsendlog:info")
	public R info(@PathVariable("id") Integer id){
		RedPacketSendLogEntity redPacketSendLog = redPacketSendLogService.queryObject(id);
		
		return R.ok().put("redPacketSendLog", redPacketSendLog);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:redpacketsendlog:save")
	public R save(@RequestBody RedPacketSendLogEntity redPacketSendLog){
		redPacketSendLogService.save(redPacketSendLog);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:redpacketsendlog:update")
	public R update(@RequestBody RedPacketSendLogEntity redPacketSendLog){
		redPacketSendLogService.update(redPacketSendLog);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:redpacketsendlog:delete")
	public R delete(@RequestBody Integer[] ids){
		redPacketSendLogService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
