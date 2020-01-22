package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.UserRoleMapper;
import com.lytw13.demo.model.TbUserRole;
import com.lytw13.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleMapper userRoleMapper;
    @Override
    public int insert(TbUserRole userRole) {
        return userRoleMapper.insert(userRole);
    }
}
