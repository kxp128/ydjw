package com.ehootu.census.dao;

import com.ehootu.census.model.Pois;
import com.ehootu.census.model.PoisExample;
import com.ehootu.census.model.PoisWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoisMapper {
    long countByExample(PoisExample example);

    int deleteByExample(PoisExample example);

    int deleteByPrimaryKey(Integer poiId);

    int insert(PoisWithBLOBs record);

    int insertSelective(PoisWithBLOBs record);

    List<PoisWithBLOBs> selectByExampleWithBLOBs(PoisExample example);

    List<Pois> selectByExample(PoisExample example);

    PoisWithBLOBs selectByPrimaryKey(Integer poiId);

    int updateByExampleSelective(@Param("record") PoisWithBLOBs record, @Param("example") PoisExample example);

    int updateByExampleWithBLOBs(@Param("record") PoisWithBLOBs record, @Param("example") PoisExample example);

    int updateByExample(@Param("record") Pois record, @Param("example") PoisExample example);

    int updateByPrimaryKeySelective(PoisWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PoisWithBLOBs record);

    int updateByPrimaryKey(Pois record);
}