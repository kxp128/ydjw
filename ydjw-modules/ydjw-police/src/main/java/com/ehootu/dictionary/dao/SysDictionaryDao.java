package com.ehootu.dictionary.dao;

import com.ehootu.core.util.BaseDao;
import com.ehootu.dictionary.model.SysDictionary;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * 
 * @author Liaoxb
 * @date 2017/12/1
 */
@Repository
public interface SysDictionaryDao extends BaseDao<SysDictionary> {
    /**
     * 根据类型和值，获取 SysDictionary 实体
     * @param type 类型
     * @param value 值
     * @return
     */
    SysDictionary getSysDictionary(@Param("type") String type, @Param("value") String value);

    /**
     * 根据 type 查询类型list
     * @param type 类型
     * @return
     */
    List<SysDictionary> selectListByType(@Param("type") String type);
}
