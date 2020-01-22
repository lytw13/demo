package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.RoleMapper;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbRole;
import com.lytw13.demo.service.RoleService;
import com.lytw13.demo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public BaseResult listRole() {
        List<TbRole> list = roleMapper.list();
        if(list.size()==0) {
            return new ResponseResult().setResultFail("查询所有失败");
        }
        return  new ResponseResult().setResultSuccess(list);
    }

    @Override
    public BaseResult get(@PathVariable("id") Integer id) {
        TbRole role = roleMapper.selectByPrimaryKey(id);
        if(role==null) {
            return new ResponseResult().setResultFail("未查到该角色信息");
        }
        return new ResponseResult().setResultSuccess(role);
    }

    @Override
    public BaseResult insert(@RequestBody TbRole tbRole) {
        Integer result = roleMapper.insert(tbRole);
        if(result<=0) {
            return new ResponseResult().setResultFail("添加失败");
        };
        return new ResponseResult().setResultSuccess(tbRole);
    }

    @Override
    public BaseResult delete(@PathVariable("id") Integer id) {
        Integer result = roleMapper.deleteByPrimaryKey(id);
        if(result == 0) {
            return new ResponseResult().setResultFail("删除失败");
        }
        return new ResponseResult().setResultSuccess("删除成功");
    }

    @Override
    public BaseResult update(@RequestBody TbRole tbRole) {
        Integer result =  roleMapper.updateByPrimaryKeySelective(tbRole);
        if(result == 0) {
            return new ResponseResult().setResultFail("更新失败");
        }
        return new ResponseResult().setResultSuccess("更新成功");
    }
}
