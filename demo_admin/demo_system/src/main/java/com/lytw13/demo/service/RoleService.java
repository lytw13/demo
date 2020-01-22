package com.lytw13.demo.service;

import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RoleService {

    @GetMapping("/role/listRole")
    BaseResult listRole();

    @GetMapping("/role/get/{id}")
    BaseResult get(@PathVariable("id") Integer id);

    @PostMapping("/role/insert")
    BaseResult insert(@RequestBody TbRole tbRole);

    @GetMapping("/role/delete/{id}")
    BaseResult delete(@PathVariable("id") Integer id);

    @PostMapping("/role/update")
    BaseResult update(@RequestBody TbRole tbRole);
}
