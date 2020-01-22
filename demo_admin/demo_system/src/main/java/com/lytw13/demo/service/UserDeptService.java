package com.lytw13.demo.service;

import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbUserDept;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UserDeptService {
    @RequestMapping(value = "/userDept/insert")
    public BaseResult insert(@RequestBody TbUserDept tbUserDept);
}
