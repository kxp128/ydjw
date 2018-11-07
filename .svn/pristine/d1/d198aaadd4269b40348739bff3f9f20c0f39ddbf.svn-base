package com.ehootu.user.service;

import com.ehootu.core.feature.orm.mybatis.Page;
import com.ehootu.core.generic.GenericService;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.User;
import com.ehootu.user.model.UserExample;

import java.util.List;

/**
 * 用户 业务 接口
 * 
 *
 * @since 2014年7月5日 上午11:53:33
 **/
public interface PoliceService extends GenericService<Police, String> {

	List<Police> policeListByPoliceOffice(String policeOffice);

	List<Police> policeListByPolice(Police police);

	Police login(Police police);

	List<Police> policeList();

}
