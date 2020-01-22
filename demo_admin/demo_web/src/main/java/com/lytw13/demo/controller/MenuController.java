package com.lytw13.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbMenu;
import com.lytw13.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("menu")
public class MenuController {
    @Autowired
    MenuService menuService;
    

    @GetMapping(value="addPage")
    public String addPage(Model model,@RequestParam(required = false) Integer pid,String menuPname) {
        model.addAttribute("pid",pid);
        model.addAttribute("menuPname",menuPname);
        return "menu/menuAddForm";
    }

    @GetMapping("modifyPage")
    public String modifyPage(Model model, Integer id) {
        BaseResult result = menuService.get(id);
        if(result.getResultCode() != 200) {
            model.addAttribute("message",result.getResultMsg());
        }
        TbMenu menu = (TbMenu) result.getResultData();
        model.addAttribute("menu",menu);
        return "/menu/menuModifyForm";
    }

    @PostMapping("add")
    public String add(Model model, TbMenu tbMenu, String ckStatus,String menuPname) {
        if(ckStatus.equalsIgnoreCase("on")) {
            tbMenu.setStatus(1);
        }else {
            tbMenu.setStatus(0);
        }
        BaseResult result = menuService.insert(tbMenu);
        if(result.getResultCode()!=200){
            model.addAttribute("message",result.getResultMsg());
        }
        return "/menu/menuList";
    }


    @PostMapping("updateMenu")
    public String updateMenu(Model model, TbMenu tbMenu, String ckStatus) {
        if(ckStatus.equalsIgnoreCase("on")) {
            tbMenu.setStatus(1);
        }else {
            tbMenu.setStatus(0);
        }
        BaseResult result = menuService.update(tbMenu);
        if(result.getResultCode() != 200) {
            model.addAttribute("message",result.getResultMsg());
        }
        return "/menu/menuList";
    }

    @GetMapping("delete")
    public String delete(Model model,Integer id) {
        BaseResult result = menuService.delete(id);
        if(result.getResultCode()!= 200) {
            model.addAttribute("message",result.getResultMsg());
        }
        return "/menu/menuList";
    }

    @GetMapping("list")
    @ResponseBody
    public List listMenu(Model model) {
        List<JSONObject> jsonList = new ArrayList<JSONObject>();
        BaseResult result = menuService.listMenu();
        if(result.getResultCode()!=200) {
            model.addAttribute("message",result.getResultMsg());
        }
        ArrayList<TbMenu> list = (ArrayList) result.getResultData();
        return list;
    }
}
