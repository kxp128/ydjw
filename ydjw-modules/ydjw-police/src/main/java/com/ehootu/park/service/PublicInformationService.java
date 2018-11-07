package com.ehootu.park.service;

import com.ehootu.park.model.PublicInformationEntity;

import java.util.List;

/**
 * 公共信息
 * 
 * @author yinyujun
 * @email 
 * @date 2017-09-21 10:21:49
 */
public interface PublicInformationService {
	
	int save(PublicInformationEntity publicInformation);
	
	List<PublicInformationEntity> selectOne(String dizhibianma);

	PublicInformationEntity select(String dizhibianma);

	List<PublicInformationEntity> selectAddress(String enterprise_address);

	void update(PublicInformationEntity PublicInformation);

	/**
	 * 根据地址编码查询公共库中是否有记录 <br/>
	 * 如果有，则标记为废弃使用 <br/>
	 * 然后重新添加最新的一条数据 <br/>
	 * 最后返回刚刚插入数据的主键 id <br/>
	 * @param publicEntity 企业基本信息公共实体参数对象
	 * @return 主键 id
	 */
	String saveUpdate(PublicInformationEntity publicEntity);

	/**
	 * 园区企业 扫一扫
	 * @param diZhiBianMa 地址编码
	 * @return 公共表已有的企业，和地址
	 */
    List parkErcodeScan(String diZhiBianMa);

	/**
	 * 园区企业档案：搜一搜<br/>
	 * 返回
	 * 		已注册的企业信息 + 基库地址信息
	 * @param xzqhmc 行政区划名称（市级区县）
	 * @param jlxmc 街（路）巷名称
	 * @param mphmc 门（楼）牌号名称
	 * @param mphhz 门（楼）牌号后缀
	 * @param lphmc 楼（栋）牌号名称
	 * @param lphhz 楼（栋）牌号后缀
	 */
    List parkErCodeSearch(String xzqhmc, String jlxmc, String mphmc, String mphhz, String lphmc, String lphhz);

	/**
	 * App 首页扫一扫（二维码）<br/>
	 * 返回
	 * 已注册的企业名称 或 基库地址信息
	 *
	 * @param diZhiBianMa 42位地址编码
	 */
	String addressScan(String diZhiBianMa);
}
