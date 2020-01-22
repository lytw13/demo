package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    Integer deleteByPrimaryKey(Integer id);

    Integer insert(TbRole tbRole);

    TbRole selectByPrimaryKey(Integer id);

    Integer updateByPrimaryKeySelective(TbRole tbRole);

    List<TbRole> list();
}
