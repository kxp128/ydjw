package com.ehootu.park.controller;

import com.ehootu.core.generic.BaseController;
import com.ehootu.flow.model.InputPersonFlow;
import com.ehootu.park.model.PublicInformationEntity;
import com.ehootu.park.service.PublicInformationService;
import org.apache.commons.configuration.ConfigurationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 公共地址信息
 *
 * @author ehoout
 */
@Controller
@RequestMapping("publicInformations")
public class PublicInformationController extends BaseController {

    @Autowired
    private PublicInformationService publicInformationService;

    /**
     * App 首页扫一扫（二维码）<br/>
     * 返回
     * 已注册的企业名称 或 基库地址信息
     *
     * @param diZhiBianMa 42位地址编码
     */
    @RequestMapping("/addressScan")
    @ResponseBody
    public void addressScan(String diZhiBianMa) {
        String addressOrCompanyName= publicInformationService.addressScan(diZhiBianMa);
        resultSuccess(addressOrCompanyName);
    }

    /**
     * 园区企业档案：扫一扫（二维码）<br/>
     * 返回
     * 已注册的企业信息 + 基库地址信息
     *
     * @param diZhiBianMa 42位地址编码
     */
    @RequestMapping("/parkErCodeScan")
    @ResponseBody
    public void parkErCodeScan(String diZhiBianMa) {
        List list = publicInformationService.parkErcodeScan(diZhiBianMa);
        resultSuccess(list);
    }

    /**
     * 园区企业档案：搜一搜<br/>
     * 返回
     * 已注册的企业信息 + 基库地址信息
     *
     * @param xzqhmc 行政区划名称（市级区县）
     * @param jlxmc 街（路）巷名称
     * @param mphmc 门（楼）牌号名称
     * @param mphhz 门（楼）牌号后缀
     * @param lphmc 楼（栋）牌号名称
     * @param lphhz 楼（栋）牌号后缀
     */
    @RequestMapping("/parkErCodeSearch")
    @ResponseBody
    public void parkErCodeSearch(String xzqhmc, String jlxmc, String mphmc, String mphhz, String lphmc, String lphhz) {
        List list = publicInformationService.parkErCodeSearch(xzqhmc, jlxmc, mphmc, mphhz, lphmc, lphhz);
        resultSuccess(list);
    }

    /**
     * 二维码扫码信息反馈
     * 返回
     *      已注册的企业信息
     *
     * @throws ConfigurationException
     */
    @ResponseBody
    @RequestMapping("/scan")
    public void scan(String diZhiBianMa) throws ConfigurationException {
        List<PublicInformationEntity> publicInformationEntity = publicInformationService.selectOne(diZhiBianMa);
        resultSuccess(publicInformationEntity);
    }


    /***
     * 搜一搜信息反馈
     * 返回
     *      已注册的企业信息
     *
     * @param inputPersonFlow xzqhmc 行政区划名称（市级区县）
     * @param inputPersonFlow jlxmc 街（路）巷名称
     * @param inputPersonFlow mphmc 门（楼）牌号名称
     * @param inputPersonFlow mphhz 门（楼）牌号后缀
     * @param inputPersonFlow lphmc 楼（栋）牌号名称
     * @param inputPersonFlow lphhz 楼（栋）牌号后缀
     * @throws ConfigurationException
     */
    @ResponseBody
    @RequestMapping(value = "/findAddress")
    public void findAddress(InputPersonFlow inputPersonFlow) throws ConfigurationException {
        StringBuilder dmdzmc = new StringBuilder();
        if (inputPersonFlow.getLphmc().equals("0")) {
            dmdzmc.append(inputPersonFlow.getXzqhmc())
                    .append(inputPersonFlow.getJlxmc())
                    .append(inputPersonFlow.getMphmc())
                    .append(inputPersonFlow.getMphhz());
        } else {
            dmdzmc.append(inputPersonFlow.getXzqhmc())
                    .append(inputPersonFlow.getJlxmc())
                    .append(inputPersonFlow.getMphmc())
                    .append(inputPersonFlow.getMphhz())
                    .append(inputPersonFlow.getLphmc())
                    .append(inputPersonFlow.getLphhz());
        }
        List<PublicInformationEntity> list = publicInformationService.selectAddress(dmdzmc.toString());
        resultSuccess(list);
    }

}
