package com.bookshop.mapper;

import com.bookshop.pojo.po.LibTsls;
import com.bookshop.pojo.po.LibTslsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibTslsMapper {
    int countByExample(LibTslsExample example);

    int deleteByExample(LibTslsExample example);

    int deleteByPrimaryKey(Integer tslsId);

    int insert(LibTsls record);

    int insertSelective(LibTsls record);

    List<LibTsls> selectByExample(LibTslsExample example);

    LibTsls selectByPrimaryKey(Integer tslsId);

    int updateByExampleSelective(@Param("record") LibTsls record, @Param("example") LibTslsExample example);

    int updateByExample(@Param("record") LibTsls record, @Param("example") LibTslsExample example);

    int updateByPrimaryKeySelective(LibTsls record);

    int updateByPrimaryKey(LibTsls record);
}