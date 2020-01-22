package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbUserDept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDeptMapper {
    void save(TbUserDept tbUserDept);
}
