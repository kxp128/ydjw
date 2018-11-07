package com.ehootu.sys.service;

import com.ehootu.sys.entity.RedPacketAmountSettingEntity;

import java.util.List;
import java.util.Map;

/**
 * 红包金额设置
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-03-05 14:40:03
 */
public interface RedPacketAmountSettingService {
	
	RedPacketAmountSettingEntity queryObject(Integer id);
	
	List<RedPacketAmountSettingEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RedPacketAmountSettingEntity redPacketAmountSetting);
	
	void update(RedPacketAmountSettingEntity redPacketAmountSetting);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
