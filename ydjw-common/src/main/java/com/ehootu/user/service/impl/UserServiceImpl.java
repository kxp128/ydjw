package com.ehootu.user.service.impl;

import com.ehootu.core.feature.orm.mybatis.Page;
import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.generic.GenericServiceImpl;
import com.ehootu.user.dao.PoliceMapper;
import com.ehootu.user.dao.UserMapper;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.PoliceExample;
import com.ehootu.user.model.User;
import com.ehootu.user.model.UserExample;
import com.ehootu.user.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户Service实现类
 *
 *
 * @since 2014年7月5日 上午11:54:24
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, String> implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private PoliceMapper policeMapper;


	@Override
	public GenericDao<User, String> getDao() {
		return userMapper;
	}

	@Override
	public User authentication(User personInfo) {
		return null;
	}

	/**
	 * 微信服务号用户登录
	 */
	@Override
	public User login(User user) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		// criteria.andPhoneNumberEqualTo(user.getPhoneNumber());
		criteria.andPhoneNumberEqualTo(user.getPhoneNumber());
		criteria.andPasswordEqualTo(user.getPassword());
		List<User> list = userMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}



	@Override
	public User selectByUsername(String username) {
		return null;
	}

	@Override
	public Page<User> selectByExampleAndPage(Page<User> page, UserExample example) {
		return null;
	}

	/**
	 * 查询用户
	 */
	@Override
	public List<User> findUser(User user) {

		UserExample example = new UserExample();

		// user.getUserName() 为注册的电话号码
		example.createCriteria().andPhoneNumberEqualTo(user.getPhoneNumber());

		List<User> list = userMapper.selectByExample(example);
		return list;

	}

	@Override
	public User selectByExample(UserExample example) {
		return null;
	}

	@Override
	public Police policeLogin(Police police) {
		PoliceExample example = new PoliceExample();
		PoliceExample.Criteria criteria = example.createCriteria();
		// criteria.andPhoneNumberEqualTo(user.getPhoneNumber());
		criteria.andPoliceNumberEqualTo(police.getPoliceNumber());
		criteria.andPolicePasswordEqualTo(police.getPolicePassword());
		List<Police> list = policeMapper.selectByExample(example);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public String findPoliceNameById(String ids) {
		StringBuffer stringBuffer = new StringBuffer();
		if (StringUtils.isBlank(ids)){return null;}
		String[] strIds = ids.split(",");
		if (null != strIds || strIds.length != 0){
			for (String id : strIds) {
				String policeName = policeMapper.findPoliceNameById(id);
				if (StringUtils.isBlank(ids)){continue;}
				stringBuffer.append(policeName).append(",");
			}
		}
		return stringBuffer.toString();
	}

	@Override
	public void savePolice(Police police) {
		policeMapper.insertSelective(police);
	}
}
