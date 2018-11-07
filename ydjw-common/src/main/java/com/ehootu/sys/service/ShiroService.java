package com.ehootu.sys.service;



import java.util.Set;

/**
 * shiro相关接口
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

/*    SysUserTokenEntity queryByToken(String token);

    *//**
     * 根据用户ID，查询用户
     * @param userId
     *//*
    SysUserEntity queryUser(Long userId);*/
}
