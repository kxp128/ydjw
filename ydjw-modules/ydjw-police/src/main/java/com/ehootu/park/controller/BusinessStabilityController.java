package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.core.util.Query;
import com.ehootu.core.util.R;
import com.ehootu.dictionary.model.SysDictionary;
import com.ehootu.dictionary.service.SysDictionaryService;
import com.ehootu.park.model.BusinessStabilityEntity;
import com.ehootu.park.model.Wrapper;
import com.ehootu.park.service.BusinessStabilityService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 园区企业维稳信息记录
 *
 * @author yinyujun
 * @email
 * @date 2017-09-21 10:21:30
 */
@RestController
@RequestMapping("/app/businessstability")
public class BusinessStabilityController extends BaseController {
    @Autowired
    private BusinessStabilityService businessStabilityService;
    @Autowired
    private SysDictionaryService dictionaryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ResponseBody
    public void list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params, "app");
        List<BusinessStabilityEntity> businessStability = businessStabilityService.queryList(query);
        resultSuccess(businessStability);
    }

    /**
     * 信息
     */
    @ResponseBody
    @RequestMapping("/info")
    public void info(String id) {
        BusinessStabilityEntity businessStability = businessStabilityService.queryObject(id);
        resultSuccess(businessStability);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(String postData) {
        Wrapper input = super.getJsonAjax(postData, Wrapper.class);
        BusinessStabilityEntity businessStability = input.getBusinessStability();
        String pageName = input.getPageName();
        businessStabilityService.save(businessStability, pageName);

        resultSuccess();
    }

    /**
     * 园区企业维稳信息记录：查询 生产经营状况 类型列表
     */
    @RequestMapping("/scjyzk")
    @ResponseBody
    public void getTypeList() {
        List<SysDictionary> list = dictionaryService.selectListByType(SysDictionary.YQQYWWXXSJ_SCJYZK);
        resultSuccess(list);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("businessstability:update")
    public R update(@RequestBody BusinessStabilityEntity businessStability) {
        businessStabilityService.update(businessStability);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("businessstability:delete")
    public R delete(@RequestBody Integer[] ids) {
        businessStabilityService.deleteBatch(ids);

        return R.ok();
    }

}
