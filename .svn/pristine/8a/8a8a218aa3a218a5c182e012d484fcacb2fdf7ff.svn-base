package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.ParkEnterpriseArchivesEntity;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.ParkEnterpriseArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 园区企业档案
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:20:10
 */
@Controller
@RequestMapping("/app/parkenterprisearchives")
public class ParkEnterpriseArchivesController extends BaseController {
	@Autowired
	private ParkEnterpriseArchivesService parkEnterpriseArchivesService;
	@Autowired
	private SysDictionaryService dictionaryService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public void list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params,"app");
		List<ParkEnterpriseArchivesEntity> parkEnterpriseArchivesList = parkEnterpriseArchivesService.queryList(query);
		resultSuccess(parkEnterpriseArchivesList);
	}

	/**
	 * 根据 记录id 查询企业档案详情
	 */
	@ResponseBody
	@RequestMapping("/info")
	public void info(String id){
		ParkEnterpriseArchivesEntity parkEnterpriseArchives = parkEnterpriseArchivesService.queryObject(id);
		resultSuccess(parkEnterpriseArchives);
	}

	/**
	 * 根据地址编码查询已登记企业档案详情
	 */
	@ResponseBody
	@RequestMapping("/infoByDzbm")
	public void infoByDzbm (String diZhiBianMa){
		ParkEnterpriseArchivesEntity parkEnterpriseArchives = parkEnterpriseArchivesService.getDetailByDzbm(diZhiBianMa);
		resultSuccess(parkEnterpriseArchives);
	}

	/**
	 * 保存
	 */
	@PostMapping("/save")
	public void save(String postData){

		Wrapper input = super.getJsonAjax(postData, Wrapper.class);
		String pageName = input.getPageName();
		ParkEnterpriseArchivesEntity parkEnterpriseArchives = input.getParkEnterpriseArchives();
		PublicInformationEntity publicInformation = input.getPublicInformation();
		parkEnterpriseArchivesService.save(parkEnterpriseArchives, publicInformation, pageName);
		resultSuccess();
	}


	/**
	 * 园区企业档案：查询 经营状况 类型列表
	 */
	@RequestMapping("/jyzk")
	@ResponseBody
	public void getTypeList(){
		List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.YQQYDA_JYZK);
		resultSuccess(list);
	}


	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody ParkEnterpriseArchivesEntity parkEnterpriseArchives){
		parkEnterpriseArchivesService.update(parkEnterpriseArchives);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Integer[] ids){
		parkEnterpriseArchivesService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
