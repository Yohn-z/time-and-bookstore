package com.bookshop.mapper;

import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTsjyExample;
import com.bookshop.pojo.vo.LibTsjyCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibTsjyMapperCustom {

    List<LibTsjyCustom> getLibTsjyCustomyyListByuId(Integer uId);
    
    List<LibTsjyCustom> getLibTsjyCustomjcListByuId(Integer uId);

    

}