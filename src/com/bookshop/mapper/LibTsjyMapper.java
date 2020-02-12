package com.bookshop.mapper;

import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTsjyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibTsjyMapper {
    int countByExample(LibTsjyExample example);

    int deleteByExample(LibTsjyExample example);

    int deleteByPrimaryKey(Integer tsjyId);

    int insert(LibTsjy record);

    int insertSelective(LibTsjy record);

    List<LibTsjy> selectByExample(LibTsjyExample example);

    LibTsjy selectByPrimaryKey(Integer tsjyId);

    int updateByExampleSelective(@Param("record") LibTsjy record, @Param("example") LibTsjyExample example);

    int updateByExample(@Param("record") LibTsjy record, @Param("example") LibTsjyExample example);

    int updateByPrimaryKeySelective(LibTsjy record);

    int updateByPrimaryKey(LibTsjy record);
}