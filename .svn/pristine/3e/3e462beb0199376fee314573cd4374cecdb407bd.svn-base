package com.ehootu.sys.controller;

import com.ehootu.sys.entity.SysUserEntity;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller公共组件
 *
 * @author zhangyong
 * @email zhangyong@ehootu.com
 * @date 2018-01-18 18:47:39
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		System.out.println("AbstractController:"+(SysUserEntity)(SecurityUtils.getSubject().getSession().getAttribute("user")));

		return (SysUserEntity) SecurityUtils.getSubject().getSession().getAttribute("user");
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}

	protected Long getDeptId() {
		return getUser().getDeptId();
	}
}
