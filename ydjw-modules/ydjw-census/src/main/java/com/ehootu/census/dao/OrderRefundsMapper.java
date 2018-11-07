package com.ehootu.census.dao;

import com.ehootu.census.model.OrderRefunds;
import com.ehootu.census.model.OrderRefundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRefundsMapper {
    long countByExample(OrderRefundsExample example);

    int deleteByExample(OrderRefundsExample example);

    int deleteByPrimaryKey(Integer orderRefundId);

    int insert(OrderRefunds record);

    int insertSelective(OrderRefunds record);

    List<OrderRefunds> selectByExample(OrderRefundsExample example);

    OrderRefunds selectByPrimaryKey(Integer orderRefundId);

    int updateByExampleSelective(@Param("record") OrderRefunds record, @Param("example") OrderRefundsExample example);

    int updateByExample(@Param("record") OrderRefunds record, @Param("example") OrderRefundsExample example);

    int updateByPrimaryKeySelective(OrderRefunds record);

    int updateByPrimaryKey(OrderRefunds record);
}