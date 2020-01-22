package com.lytw13.demo.service;

import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbNotice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface NoticeService {

    @GetMapping("/notice/listNotice")
    BaseResult listNotice();

    @GetMapping("/notice/get/{id}")
    BaseResult get(@PathVariable("id") Integer id);

    @PostMapping("/notice/insert")
    BaseResult insert(@RequestBody TbNotice tbNotice);

    @GetMapping("/notice/delete/{id}")
    BaseResult delete(@PathVariable("id") Integer id);

    @PostMapping("/notice/update")
    BaseResult update(@RequestBody TbNotice tbNotice);
}
