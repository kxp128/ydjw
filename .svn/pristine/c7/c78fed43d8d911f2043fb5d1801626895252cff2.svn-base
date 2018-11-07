package com.ehootu.sys.service;

import com.ehootu.sys.entity.SysUserTokenEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统用户Token
 * 
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-24 15:10:15
 */
public interface SysUserTokenService {
	
	SysUserTokenEntity queryObject(Long userId);
	
	List<SysUserTokenEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysUserTokenEntity sysUserToken);
	
	void update(SysUserTokenEntity sysUserToken);
	
	void delete(Long userId);
	
	void deleteBatch(Long[] userIds);
}
