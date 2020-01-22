package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbRoleMenu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMenuMapper {
    int insert(TbRoleMenu roleMenu);

    int delete(Integer id);
}
