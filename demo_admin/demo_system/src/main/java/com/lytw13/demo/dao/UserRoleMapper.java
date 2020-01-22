package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper  {

    int insert(TbUserRole userRole);
}
