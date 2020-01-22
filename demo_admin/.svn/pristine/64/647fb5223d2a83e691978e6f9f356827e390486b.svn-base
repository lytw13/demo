package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.DeptMapper;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbDept;
import com.lytw13.demo.service.DeptService;
import com.lytw13.demo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;
    @Override
    public BaseResult list() {
        List<TbDept> deptList = deptMapper.list();
        if(deptList.size() == 0) {
            return new ResponseResult().setResultFail("没有查到相应结果");
        }
        return new ResponseResult().setResultSuccess(deptList);
    }
    
}
