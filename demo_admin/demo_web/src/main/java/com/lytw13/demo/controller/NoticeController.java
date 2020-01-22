package com.lytw13.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.PageVo;
import com.lytw13.demo.model.TbNotice;
import com.lytw13.demo.service.NoticeService;
import com.lytw13.demo.utils.MapAndModelConverge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Controller
@RequestMapping("notice")
public class NoticeController {
    @Autowired
    NoticeService noticeService;

//    @GetMapping("modifyPage")
//    public String modifyPage(Model model, Integer id) {
//        BaseResult result = noticeService.get(id);
//        if(result.getResultCode() != 200) {
//            model.addAttribute("message",result.getResultMsg());
//        }
//        TbNotice notice = (TbNotice) result.getResultData();
//        model.addAttribute("notice",notice);
//        return "/notice/noticeModifyForm";
//    }

    @PostMapping("add")
    public String add(Model model, TbNotice tbNotice) {
        BaseResult result = noticeService.insert(tbNotice);
        if(result.getResultCode()!=200){
            model.addAttribute("message",result.getResultMsg());
        }
        return "/notice/noticeList";
    }


    @PostMapping("updateNotice")
    public String updateNotice(Model model, TbNotice tbNotice) {
        BaseResult result = noticeService.update(tbNotice);
        if(result.getResultCode() != 200) {
            model.addAttribute("message",result.getResultMsg());
        }
        return "/notice/noticeList";
    }

    @GetMapping("delete")
    public String delete(Model model,Integer id) {
        BaseResult result = noticeService.delete(id);
        if(result.getResultCode()!= 200) {
            model.addAttribute("message",result.getResultMsg());
        }
        return "/notice/noticeList";
    }

    @GetMapping("list")
    @ResponseBody
    public PageInfo listNotice(Model model, PageVo pageVo, TbNotice tbNotice) {
        PageHelper.startPage(pageVo.getPageNumber(),pageVo.getPageSize());
        BaseResult result = noticeService.listNotice();
        if(result.getResultCode()!=200) {
            model.addAttribute("message",result.getResultMsg());
        }
        ArrayList resultData = (ArrayList) result.getResultData();
        PageInfo<TbNotice> pageInfo = new PageInfo<TbNotice>(resultData);
        return pageInfo;
    }

}
