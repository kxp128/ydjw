package com.ehootu.census.dao;

import com.ehootu.census.model.Coupons;
import com.ehootu.census.model.CouponsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponsMapper {
    long countByExample(CouponsExample example);

    int deleteByExample(CouponsExample example);

    int deleteByPrimaryKey(Integer couponId);

    int insert(Coupons record);

    int insertSelective(Coupons record);

    List<Coupons> selectByExample(CouponsExample example);

    Coupons selectByPrimaryKey(Integer couponId);

    int updateByExampleSelective(@Param("record") Coupons record, @Param("example") CouponsExample example);

    int updateByExample(@Param("record") Coupons record, @Param("example") CouponsExample example);

    int updateByPrimaryKeySelective(Coupons record);

    int updateByPrimaryKey(Coupons record);
}