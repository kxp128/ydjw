package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.StarRatingEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.StarRatingService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 园区企业星级评定
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:59
 */
@RestController
@RequestMapping("/app/starrating")
public class StarRatingController extends BaseController{
	@Autowired
	private StarRatingService starRatingService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<StarRatingEntity> starRating = starRatingService.queryList(query);
		resultSuccess(starRating);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		StarRatingEntity starRating = starRatingService.queryObject(id);
		resultSuccess(starRating);
	}

	
	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){
		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		StarRatingEntity starRating = input.getStarRating();
	    PublicInformationEntity publicInformation = input.getPublicInformation();
	    String pageName = input.getPageName();
    	starRatingService.save(starRating, publicInformation, pageName);
		resultSuccess();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("starrating:update")
	public R update(@RequestBody StarRatingEntity starRating){
		starRatingService.update(starRating);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("starrating:delete")
	public R delete(@RequestBody Integer[] ids){
		starRatingService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
