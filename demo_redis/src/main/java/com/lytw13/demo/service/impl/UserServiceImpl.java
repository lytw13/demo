package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.UserMapper;
import com.lytw13.demo.model.TbUser;
import com.lytw13.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void save(TbUser user) {
        userMapper.insert(user);
    }

    @Override
    public TbUser get(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
