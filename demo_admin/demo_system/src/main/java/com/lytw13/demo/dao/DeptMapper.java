package com.lytw13.demo.dao;

import com.lytw13.demo.model.TbDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeptMapper {
    List<TbDept> list();

    List<TbDept> listUserById(List<Integer> id);
}
