package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.UserDeptMapper;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbUserDept;
import com.lytw13.demo.service.UserDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDeptServiceImpl implements UserDeptService {
    @Autowired
    UserDeptMapper userDeptMapper;
    @Transactional
    @Override
    public BaseResult insert(@RequestBody TbUserDept tbUserDept) {
        userDeptMapper.save(tbUserDept);
        return null;
    }
}
