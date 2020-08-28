package com.example.demo.project.异常;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @description：全局异常处理类
 * @Created by 李泽阳 @on 2020/8/28 10:47
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public JSONObject ExceptionHandler(HttpServletRequest req, Exception e) {
        log.error("全局异常捕获", e);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", ErrorCode.FAIL.getCode());
        jsonObject.put("msg", ErrorCode.FAIL.getMsg());
        return jsonObject;
    }

}
