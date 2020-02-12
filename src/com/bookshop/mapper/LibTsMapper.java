package com.bookshop.mapper;

import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibTsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibTsMapper {
    int countByExample(LibTsExample example);

    int deleteByExample(LibTsExample example);

    int deleteByPrimaryKey(Integer tsId);

    int insert(LibTs record);

    int insertSelective(LibTs record);

    List<LibTs> selectByExample(LibTsExample example);

    LibTs selectByPrimaryKey(Integer tsId);

    int updateByExampleSelective(@Param("record") LibTs record, @Param("example") LibTsExample example);

    int updateByExample(@Param("record") LibTs record, @Param("example") LibTsExample example);

    int updateByPrimaryKeySelective(LibTs record);

    int updateByPrimaryKey(LibTs record);
}