package com.ehootu.user.service.impl;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.core.generic.GenericServiceImpl;
import com.ehootu.user.dao.MenuMapper;
import com.ehootu.user.model.Menu;
import com.ehootu.user.model.MenuExample;
import com.ehootu.user.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangyong
 * @create 2018-01-17 9:42
 **/
@Service
public class MenuServiceImpl extends GenericServiceImpl<Menu, Integer> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;


    @Override
    public GenericDao<Menu, Integer> getDao() {
        return menuMapper;
    }


    @Override
    public List<Menu> selectByExample(MenuExample example) {
        return menuMapper.selectByExample(example);
    }

}

