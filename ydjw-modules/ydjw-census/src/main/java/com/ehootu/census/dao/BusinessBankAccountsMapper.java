package com.ehootu.census.dao;

import com.ehootu.census.model.BusinessBankAccounts;
import com.ehootu.census.model.BusinessBankAccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessBankAccountsMapper {
    long countByExample(BusinessBankAccountsExample example);

    int deleteByExample(BusinessBankAccountsExample example);

    int deleteByPrimaryKey(Integer businessBankId);

    int insert(BusinessBankAccounts record);

    int insertSelective(BusinessBankAccounts record);

    List<BusinessBankAccounts> selectByExample(BusinessBankAccountsExample example);

    BusinessBankAccounts selectByPrimaryKey(Integer businessBankId);

    int updateByExampleSelective(@Param("record") BusinessBankAccounts record, @Param("example") BusinessBankAccountsExample example);

    int updateByExample(@Param("record") BusinessBankAccounts record, @Param("example") BusinessBankAccountsExample example);

    int updateByPrimaryKeySelective(BusinessBankAccounts record);

    int updateByPrimaryKey(BusinessBankAccounts record);
}