package com.ehootu.census.dao;

import com.ehootu.census.model.MarketingUserAccountRecords;
import com.ehootu.census.model.MarketingUserAccountRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingUserAccountRecordsMapper {
    long countByExample(MarketingUserAccountRecordsExample example);

    int deleteByExample(MarketingUserAccountRecordsExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(MarketingUserAccountRecords record);

    int insertSelective(MarketingUserAccountRecords record);

    List<MarketingUserAccountRecords> selectByExample(MarketingUserAccountRecordsExample example);

    MarketingUserAccountRecords selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") MarketingUserAccountRecords record, @Param("example") MarketingUserAccountRecordsExample example);

    int updateByExample(@Param("record") MarketingUserAccountRecords record, @Param("example") MarketingUserAccountRecordsExample example);

    int updateByPrimaryKeySelective(MarketingUserAccountRecords record);

    int updateByPrimaryKey(MarketingUserAccountRecords record);
}