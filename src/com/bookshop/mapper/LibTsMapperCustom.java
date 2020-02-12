package com.bookshop.mapper;

import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibTsExample;
import com.bookshop.pojo.vo.LibTsCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibTsMapperCustom {
    public List<LibTsCustom> getLibTsCustomList();
}