package com.ehootu.sys.service;

import com.ehootu.sys.entity.RedPacketSendLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 红包发送记录
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-03-05 14:40:02
 */
public interface RedPacketSendLogService {
	
	RedPacketSendLogEntity queryObject(Integer id);
	
	List<RedPacketSendLogEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RedPacketSendLogEntity redPacketSendLog);
	
	void update(RedPacketSendLogEntity redPacketSendLog);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
