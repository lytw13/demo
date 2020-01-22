package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.RoleMenuMapper;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbRoleMenu;
import com.lytw13.demo.service.RoleMenuService;
import com.lytw13.demo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleMenuServiceImpl implements RoleMenuService {
    @Autowired
    RoleMenuMapper roleMenuMapper;
    @Override
    public BaseResult save(TbRoleMenu roleMenu) {
        int result = roleMenuMapper.insert(roleMenu);
        if(result<=0) {
            return new ResponseResult().setResultFail("添加失败");
        };
        return new ResponseResult().setResultSuccess(roleMenu);
    }

    @Override
    public BaseResult delete(Integer id) {
        int result = roleMenuMapper.delete(id);
        if(result<=0) {
            return new ResponseResult().setResultFail("添加失败");
        };
        return new ResponseResult().setResultSuccess(id);
    }
}
