package com.lytw13.demo.controller;

import com.lytw13.demo.model.TbUser;
import com.lytw13.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("save")
    public String save(@RequestBody TbUser user) {
        userService.save(user);
        return "success";
    }
}
