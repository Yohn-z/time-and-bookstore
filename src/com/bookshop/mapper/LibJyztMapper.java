package com.bookshop.mapper;

import com.bookshop.pojo.po.LibJyzt;
import com.bookshop.pojo.po.LibJyztExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibJyztMapper {
    int countByExample(LibJyztExample example);

    int deleteByExample(LibJyztExample example);

    int deleteByPrimaryKey(Integer jyztId);

    int insert(LibJyzt record);

    int insertSelective(LibJyzt record);

    List<LibJyzt> selectByExample(LibJyztExample example);

    LibJyzt selectByPrimaryKey(Integer jyztId);

    int updateByExampleSelective(@Param("record") LibJyzt record, @Param("example") LibJyztExample example);

    int updateByExample(@Param("record") LibJyzt record, @Param("example") LibJyztExample example);

    int updateByPrimaryKeySelective(LibJyzt record);

    int updateByPrimaryKey(LibJyzt record);
}