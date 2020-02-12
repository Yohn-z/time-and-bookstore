package com.bookshop.mapper;

import com.bookshop.pojo.po.LibUsers;
import com.bookshop.pojo.po.LibUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibUsersMapper {
    int countByExample(LibUsersExample example);

    int deleteByExample(LibUsersExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(LibUsers record);

    int insertSelective(LibUsers record);

    List<LibUsers> selectByExample(LibUsersExample example);

    LibUsers selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") LibUsers record, @Param("example") LibUsersExample example);

    int updateByExample(@Param("record") LibUsers record, @Param("example") LibUsersExample example);

    int updateByPrimaryKeySelective(LibUsers record);

    int updateByPrimaryKey(LibUsers record);
}