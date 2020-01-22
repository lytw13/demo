package com.lytw13.demo.utils;


import com.lytw13.demo.model.BaseResult;

public class ResponseResult {
    public BaseResult setResult(Integer resultCode, String resultMsg, Object resultData){
        return new BaseResult(resultCode, resultMsg, resultData);
    }
    public BaseResult setResultSuccess(Object resultData) {
        return  new BaseResult(200,"success",resultData);
    }
    public BaseResult setResultFail(String msg) {
        return  new BaseResult(400,msg,null);
    }
}
