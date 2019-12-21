package com.lytw13.demo.controller;

import com.lytw13.demo.model.TbUser;
import com.lytw13.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("get/{id}")
    public TbUser get(@PathVariable("id")Integer id) {
        TbUser tbUser = userService.get(id);
        redisTemplate.opsForValue().set("user"+id,tbUser);
        return tbUser;
    }

}
