package com.bookshop.mapper;

import com.bookshop.pojo.po.LibLetter;
import com.bookshop.pojo.po.LibLetterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibLetterMapper {
    int countByExample(LibLetterExample example);

    int deleteByExample(LibLetterExample example);

    int deleteByPrimaryKey(Integer lId);

    int insert(LibLetter record);

    int insertSelective(LibLetter record);

    List<LibLetter> selectByExample(LibLetterExample example);

    LibLetter selectByPrimaryKey(Integer lId);

    int updateByExampleSelective(@Param("record") LibLetter record, @Param("example") LibLetterExample example);

    int updateByExample(@Param("record") LibLetter record, @Param("example") LibLetterExample example);

    int updateByPrimaryKeySelective(LibLetter record);

    int updateByPrimaryKey(LibLetter record);
}