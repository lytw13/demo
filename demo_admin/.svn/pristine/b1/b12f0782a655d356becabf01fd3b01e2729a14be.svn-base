package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    Integer deleteByPrimaryKey(Integer id);

    Integer insert(TbMenu tbMenu);

    TbMenu selectByPrimaryKey(Integer id);

    Integer updateByPrimaryKeySelective(TbMenu tbMenu);

    List<TbMenu> list();
}
