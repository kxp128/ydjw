package com.ehootu.notice.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ehootu.core.util.PageUtils;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.notice.model.Notice;
import com.ehootu.notice.service.NoticePoliceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehootu.notice.entity.NoticeEntity;
import com.ehootu.notice.service.NoticeService;





/**
 * 通知消息
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-26 17:53:47
 */
@RestController
@RequestMapping("/sys/notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;

	@Autowired
    private NoticePoliceService noticePoliceService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:notice:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NoticeEntity> noticeList = noticeService.queryList(query);
		int total = noticeService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(noticeList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);



	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sys:notice:info")
	public R info(@PathVariable("id") String id){
		NoticeEntity notice = noticeService.queryObject(id);

		List<String> policeIdList = noticePoliceService.queryPoliceIdList(id);

		notice.setPoliceIdList(policeIdList);

		return R.ok().put("notice", notice);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sys:notice:save")
	public R save(@RequestBody NoticeEntity notice){
		System.out.println(notice);
		notice.setIsSync(0);
		notice.setPublishTime(new Date());
		notice.setCreateTime(new Date());
		noticeService.save(notice);
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sys:notice:update")
	public R update(@RequestBody NoticeEntity notice){
		notice.setIsSync(0);
		notice.setPublishTime(new Date());
		notice.setCreateTime(new Date());
		noticeService.update(notice);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sys:notice:delete")
	public R delete(@RequestBody String[] ids){
		noticeService.deleteBatch(ids);
		return R.ok();
	}

	@RequestMapping(value = "/list/{policeId}")
	public R queryListByPolice(@PathVariable("policeId") String policeId){
		List<NoticeEntity> list = noticeService.queryListByPolice(policeId);
		return  R.ok().put("list",list);
	}
	
}
