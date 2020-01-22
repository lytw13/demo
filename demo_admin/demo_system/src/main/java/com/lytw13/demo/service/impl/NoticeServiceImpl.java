package com.lytw13.demo.service.impl;

import com.lytw13.demo.dao.NoticeMapper;
import com.lytw13.demo.model.BaseResult;
import com.lytw13.demo.model.TbNotice;
import com.lytw13.demo.service.NoticeService;
import com.lytw13.demo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeMapper noticeMapper;
    @Override
    public BaseResult listNotice() {
        List<TbNotice> list = noticeMapper.list();
        if(list.size()==0) {
            return new ResponseResult().setResultFail("查询所有失败");
        }
        return  new ResponseResult().setResultSuccess(list);
    }

    @Override
    public BaseResult get(@PathVariable("id") Integer id) {
        TbNotice notice = noticeMapper.selectByPrimaryKey(id);
        if(notice==null) {
            return new ResponseResult().setResultFail("未查到该角色信息");
        }
        return new ResponseResult().setResultSuccess(notice);
    }

    @Override
    public BaseResult insert(@RequestBody TbNotice tbNotice) {
        Integer result = noticeMapper.insert(tbNotice);
        if(result<=0) {
            return new ResponseResult().setResultFail("添加失败");
        };
        return new ResponseResult().setResultSuccess(tbNotice);
    }

    @Override
    public BaseResult delete(@PathVariable("id") Integer id) {
        Integer result = noticeMapper.deleteByPrimaryKey(id);
        if(result == 0) {
            return new ResponseResult().setResultFail("删除失败");
        }
        return new ResponseResult().setResultSuccess("删除成功");
    }

    @Override
    public BaseResult update(@RequestBody TbNotice tbNotice) {
        Integer result =  noticeMapper.updateByPrimaryKeySelective(tbNotice);
        if(result == 0) {
            return new ResponseResult().setResultFail("更新失败");
        }
        return new ResponseResult().setResultSuccess("更新成功");
    }
}
