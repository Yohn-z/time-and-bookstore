package com.bookshop.mapper;

import com.bookshop.pojo.po.LibSkzt;
import com.bookshop.pojo.po.LibSkztExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibSkztMapper {
    int countByExample(LibSkztExample example);

    int deleteByExample(LibSkztExample example);

    int deleteByPrimaryKey(Integer skztId);

    int insert(LibSkzt record);

    int insertSelective(LibSkzt record);

    List<LibSkzt> selectByExample(LibSkztExample example);

    LibSkzt selectByPrimaryKey(Integer skztId);

    int updateByExampleSelective(@Param("record") LibSkzt record, @Param("example") LibSkztExample example);

    int updateByExample(@Param("record") LibSkzt record, @Param("example") LibSkztExample example);

    int updateByPrimaryKeySelective(LibSkzt record);

    int updateByPrimaryKey(LibSkzt record);
}