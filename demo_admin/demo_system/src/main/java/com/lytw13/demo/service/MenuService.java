package com.lytw13.demo.service;

import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbMenu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MenuService {

    @GetMapping("/menu/listMenu")
    BaseResult listMenu();

    @GetMapping("/menu/get/{id}")
    BaseResult get(@PathVariable("id") Integer id);

    @PostMapping("/menu/insert")
    BaseResult insert(@RequestBody TbMenu tbMenu);

    @GetMapping("/menu/delete/{id}")
    BaseResult delete(@PathVariable("id") Integer id);

    @PostMapping("/menu/update")
    BaseResult update(@RequestBody TbMenu tbMenu);
}
