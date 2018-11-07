package com.ehootu.core.security;

import com.ehootu.sys.entity.SysUserEntity;
import com.ehootu.sys.service.ShiroService;
import com.ehootu.sys.service.SysUserService;
import com.ehootu.user.model.Police;
import com.ehootu.user.service.PoliceService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;


/**
 * 用户身份验证,授权 Realm 组件
 * 
 *
 **/
public class SecurityRealm extends AuthorizingRealm {
	@Autowired
	private PoliceService policeService;
	@Autowired
	private ShiroService shiroService;
	@Autowired
	private SysUserService sysUserService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Set<String> strings = shiroService.getUserPermissions(1);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setStringPermissions(strings);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = String.valueOf(token.getPrincipal());
		String password = new String((char[]) token.getCredentials());

		// 通过数据库进行验证
		SysUserEntity user = sysUserService.queryByUserName(username);
		if (user == null) {
			throw new AuthenticationException("用户名或密码错误.");
		}

		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, password, getName());

		SecurityUtils.getSubject().getSession().setAttribute("user",user);

		System.out.println("session:"+(SysUserEntity)(SecurityUtils.getSubject().getSession().getAttribute("user")));
		return authenticationInfo;
	}

}
