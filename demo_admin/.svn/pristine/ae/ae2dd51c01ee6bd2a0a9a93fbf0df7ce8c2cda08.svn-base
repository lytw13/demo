package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.MenuMapper;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbMenu;
import com.lytw13.demo.service.MenuService;
import com.lytw13.demo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public BaseResult listMenu() {
        List<TbMenu> list = menuMapper.list();
        if(list.size()==0) {
            return new ResponseResult().setResultFail("查询所有失败");
        }
        return  new ResponseResult().setResultSuccess(list);
    }

    @Override
    public BaseResult get(@PathVariable("id") Integer id) {
        TbMenu menu = menuMapper.selectByPrimaryKey(id);
        if(menu==null) {
            return new ResponseResult().setResultFail("未查到该角色信息");
        }
        return new ResponseResult().setResultSuccess(menu);
    }

    @Override
    public BaseResult insert(@RequestBody TbMenu tbMenu) {
        Integer result = menuMapper.insert(tbMenu);
        if(result<=0) {
            return new ResponseResult().setResultFail("添加失败");
        };
        return new ResponseResult().setResultSuccess(tbMenu);
    }

    @Override
    public BaseResult delete(@PathVariable("id") Integer id) {
        Integer result = menuMapper.deleteByPrimaryKey(id);
        if(result == 0) {
            return new ResponseResult().setResultFail("删除失败");
        }
        return new ResponseResult().setResultSuccess("删除成功");
    }

    @Override
    public BaseResult update(@RequestBody TbMenu tbMenu) {
        Integer result =  menuMapper.updateByPrimaryKeySelective(tbMenu);
        if(result == 0) {
            return new ResponseResult().setResultFail("更新失败");
        }
        return new ResponseResult().setResultSuccess("更新成功");
    }
}
