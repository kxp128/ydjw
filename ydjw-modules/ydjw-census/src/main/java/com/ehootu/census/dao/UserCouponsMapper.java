package com.ehootu.census.dao;

import com.ehootu.census.model.UserCoupons;
import com.ehootu.census.model.UserCouponsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCouponsMapper {
    long countByExample(UserCouponsExample example);

    int deleteByExample(UserCouponsExample example);

    int deleteByPrimaryKey(Long userCouponId);

    int insert(UserCoupons record);

    int insertSelective(UserCoupons record);

    List<UserCoupons> selectByExample(UserCouponsExample example);

    UserCoupons selectByPrimaryKey(Long userCouponId);

    int updateByExampleSelective(@Param("record") UserCoupons record, @Param("example") UserCouponsExample example);

    int updateByExample(@Param("record") UserCoupons record, @Param("example") UserCouponsExample example);

    int updateByPrimaryKeySelective(UserCoupons record);

    int updateByPrimaryKey(UserCoupons record);
}