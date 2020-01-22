package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    Integer deleteByPrimaryKey(Integer id);

    Integer insert(TbUser tbUser);

    TbUser selectByPrimaryKey(Integer id);

    Integer updateByPrimaryKeySelective(TbUser tbUser);

    List<TbUser> list(TbUser user);


    TbUser selectByName(String name);

    List<TbUser> selectByDept(List deptIds);

    List selectUserPermission(Integer id);

}