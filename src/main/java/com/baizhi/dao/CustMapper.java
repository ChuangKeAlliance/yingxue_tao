package com.baizhi.dao;

import com.baizhi.entity.Cust;
import com.baizhi.entity.CustExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustMapper {
    long countByExample(CustExample example);

    int deleteByExample(CustExample example);

    int deleteByPrimaryKey(String id);

    int insert(Cust record);

    int insertSelective(Cust record);

    List<Cust> selectByExample(CustExample example);

    Cust selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Cust record, @Param("example") CustExample example);

    int updateByExample(@Param("record") Cust record, @Param("example") CustExample example);

    int updateByPrimaryKeySelective(Cust record);

    int updateByPrimaryKey(Cust record);
}