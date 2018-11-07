package com.ehootu.sys.service.impl;

import com.ehootu.sys.dao.SysUserTokenDao;
import com.ehootu.sys.entity.SysUserTokenEntity;
import com.ehootu.sys.service.SysUserTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl implements SysUserTokenService {
	@Autowired
	private SysUserTokenDao sysUserTokenDao;
	
	@Override
	public SysUserTokenEntity queryObject(Long userId){
		return sysUserTokenDao.queryObject(userId);
	}
	
	@Override
	public List<SysUserTokenEntity> queryList(Map<String, Object> map){
		return sysUserTokenDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return sysUserTokenDao.queryTotal(map);
	}
	
	@Override
	public void save(SysUserTokenEntity sysUserToken){
		sysUserTokenDao.save(sysUserToken);
	}
	
	@Override
	public void update(SysUserTokenEntity sysUserToken){
		sysUserTokenDao.update(sysUserToken);
	}
	
	@Override
	public void delete(Long userId){
		sysUserTokenDao.delete(userId);
	}
	
	@Override
	public void deleteBatch(Long[] userIds){
		sysUserTokenDao.deleteBatch(userIds);
	}
	
}
