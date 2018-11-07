package com.ehootu.notice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ehootu.core.generic.BaseController;
import com.ehootu.notice.entity.NoticeEntity;
import com.ehootu.notice.service.NoticeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ehootu.notice.entity.NoticePoliceEntity;
import com.ehootu.notice.service.NoticePoliceService;
import com.ehootu.core.util.PageUtils;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;




/**
 * 消息与人员的关联表
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-26 17:53:47
 */
@Controller
@RequestMapping("/app/notice/")
public class AppNoticeController extends BaseController{
	@Autowired
	private NoticeService noticeService;


	@Autowired
	private NoticePoliceService noticePoliceService;

	@RequestMapping(value = "/list/{policeId}")
	public void queryListByPolice(@PathVariable("policeId") String policeId){
		List<NoticeEntity> list = noticeService.queryListByPolice(policeId);
		resultSuccess(list);
	}

	@RequestMapping(value = "/info")
	public void updateNoticePolice(String policeId,String noticeId){
		System.out.println("this is :"+policeId+"  ;"+ noticeId);
		Map<String,Object> map = new HashMap<>();
		map.put("noticeId",noticeId);
		map.put("policeId",policeId);
		NoticePoliceEntity noticePoliceEntity =noticePoliceService.queryNoticePolice(map);
		noticePoliceEntity.setSeeFlag(1);
		noticePoliceService.update(noticePoliceEntity);
		NoticeEntity noticeEntity = noticeService.queryObject(noticeId);
		resultSuccess(noticeEntity);
	}
}
