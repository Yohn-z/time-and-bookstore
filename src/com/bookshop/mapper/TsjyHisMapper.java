package com.bookshop.mapper;

import com.bookshop.pojo.po.TsjyHis;
import com.bookshop.pojo.po.TsjyHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsjyHisMapper {
    int countByExample(TsjyHisExample example);

    int deleteByExample(TsjyHisExample example);

    int deleteByPrimaryKey(Integer tsjyId);

    int insert(TsjyHis record);

    int insertSelective(TsjyHis record);

    List<TsjyHis> selectByExample(TsjyHisExample example);

    TsjyHis selectByPrimaryKey(Integer tsjyId);

    int updateByExampleSelective(@Param("record") TsjyHis record, @Param("example") TsjyHisExample example);

    int updateByExample(@Param("record") TsjyHis record, @Param("example") TsjyHisExample example);

    int updateByPrimaryKeySelective(TsjyHis record);

    int updateByPrimaryKey(TsjyHis record);
}