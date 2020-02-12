package com.bookshop.mapper;

import com.bookshop.pojo.po.LibTslb;
import com.bookshop.pojo.po.LibTslbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibTslbMapper {
    int countByExample(LibTslbExample example);

    int deleteByExample(LibTslbExample example);

    int deleteByPrimaryKey(String tslbName);

    int insert(LibTslb record);

    int insertSelective(LibTslb record);

    List<LibTslb> selectByExample(LibTslbExample example);

    LibTslb selectByPrimaryKey(String tslbName);

    int updateByExampleSelective(@Param("record") LibTslb record, @Param("example") LibTslbExample example);

    int updateByExample(@Param("record") LibTslb record, @Param("example") LibTslbExample example);

    int updateByPrimaryKeySelective(LibTslb record);

    int updateByPrimaryKey(LibTslb record);
}