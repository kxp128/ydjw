package com.ehootu.user.service.impl;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.generic.GenericServiceImpl;
import com.ehootu.core.util.StringUtils;
import com.ehootu.user.dao.PoliceMapper;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.PoliceExample;
import com.ehootu.user.model.User;
import com.ehootu.user.service.PoliceService;
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
public class PoliceServiceImpl extends GenericServiceImpl<Police, String> implements PoliceService {


	@Autowired
	private PoliceMapper policeMapper;

	@Override
	public GenericDao<Police, String> getDao() {
		return policeMapper;
	}

	@Override
	public List<Police> policeListByPolice(Police police) {
		PoliceExample policeExample = new PoliceExample();
		if (!StringUtils.isNoneBlank(police.getPoliceOffice())) {
			return null;
		}
		policeExample.createCriteria()
				.andPoliceOfficeEqualTo(police.getPoliceOffice())
				.andIdNotEqualTo(police.getId());
		return policeMapper.selectByExample(policeExample);
	}

	@Override
	public Police login(Police police) {
		PoliceExample policeExample = new PoliceExample();
		policeExample.createCriteria()
				.andPoliceNumberEqualTo(police.getPoliceNumber())
				.andPolicePasswordEqualTo(police.getPolicePassword());
		List<Police> policeList = policeMapper.selectByExample(policeExample);
		if(policeList==null || policeList.size()==0){
			return null;
		}
		return policeList.get(0);
	}

	@Override
	public List<Police> policeList() {
		PoliceExample example =new PoliceExample();
		example.createCriteria().andPoliceNameNotEqualTo("admin");
		return policeMapper.selectByExample(example);
	}

	@Override
	public List<Police> policeListByPoliceOffice(String policeOffice) {
		return null;
	}

}
