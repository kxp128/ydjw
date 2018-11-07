package com.ehootu.census.dao;

import com.ehootu.census.model.CensusRegisterAttachment;
import com.ehootu.census.model.CensusRegisterAttachmentExample;
import com.ehootu.core.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CensusRegisterAttachmentMapper extends GenericDao<CensusRegisterAttachment,Integer> {
    long countByExample(CensusRegisterAttachmentExample example);

    int deleteByExample(CensusRegisterAttachmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(CensusRegisterAttachment record);

    int insertSelective(CensusRegisterAttachment record);

    List<CensusRegisterAttachment> selectByExample(CensusRegisterAttachmentExample example);

    CensusRegisterAttachment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CensusRegisterAttachment record, @Param("example") CensusRegisterAttachmentExample example);

    int updateByExample(@Param("record") CensusRegisterAttachment record, @Param("example") CensusRegisterAttachmentExample example);

    int updateByPrimaryKeySelective(CensusRegisterAttachment record);

    int updateByPrimaryKey(CensusRegisterAttachment record);
}