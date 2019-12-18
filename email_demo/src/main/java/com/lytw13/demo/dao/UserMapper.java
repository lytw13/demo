package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void insert(TbUser user);
    Integer selectByPrimaryKey();
}
