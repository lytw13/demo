package com.lytw13.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbDept;
import com.lytw13.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("listDept")
    @ResponseBody
    public String listDept(Model model) {
        List<JSONObject> jsonList = new ArrayList<JSONObject>();
        BaseResult result = deptService.list();
        if(result.getResultCode()!=200) {
            model.addAttribute("message","查询部门出现异常");
        }
        ArrayList<TbDept> list = (ArrayList)result.getResultData();
        for (TbDept tbDept : list) {
            JSONObject json = new JSONObject();
            json.put("id", tbDept.getId());
            json.put("pid", tbDept.getPid());
            json.put("name", tbDept.getName());
            jsonList.add(json);
       }
        String zNodes = JSONObject.toJSONString(jsonList);
        return zNodes;
    }
}
