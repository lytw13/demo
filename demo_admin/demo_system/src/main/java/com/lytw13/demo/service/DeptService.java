package com.lytw13.demo.service;

import com.lytw13.demo.model.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;


public interface DeptService {
    @GetMapping("/dept/list")
    public BaseResult list();

}
