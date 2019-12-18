package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.UserMapper;
import com.lytw13.demo.model.TbUser;
import com.lytw13.demo.service.UserService;
import com.lytw13.demo.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void save(TbUser user) {
        long startTime = System.currentTimeMillis();
        userMapper.insert(user);
        List<String> fileList = new ArrayList<>();
        fileList.add("E:\\others\\MyBlog\\新建文本文档1.txt");
        fileList.add("E:\\others\\MyBlog\\新建文本文档.txt");
        MailUtil.sendHtmlTemplateMail(user.getEmail(),user.getName(),fileList);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime-startTime));
    }
}
