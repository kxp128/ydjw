package com.ehootu.user.dao;

import com.ehootu.core.generic.GenericDao;
import com.ehootu.user.model.Police;
import com.ehootu.user.model.PoliceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoliceMapper extends GenericDao<Police, String> {
    long countByExample(PoliceExample example);

    int deleteByExample(PoliceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Police record);

    int insertSelective(Police record);

    List<Police> selectByExample(PoliceExample example);

    Police selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Police record, @Param("example") PoliceExample example);

    int updateByExample(@Param("record") Police record, @Param("example") PoliceExample example);

    int updateByPrimaryKeySelective(Police record);

    int updateByPrimaryKey(Police record);
    /**
     * 根据警察id查询警察名称
     */
    String findPoliceNameById(String id);
}