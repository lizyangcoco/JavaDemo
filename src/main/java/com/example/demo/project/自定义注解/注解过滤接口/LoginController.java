package com.example.demo.project.自定义注解.注解过滤接口;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @description：登录测试接口
 * @Created by 李泽阳 @on 2020/8/27 16:26
 */
@Slf4j
@RestController
public class LoginController {


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public void login(@RequestParam String userName, @RequestParam String password) {
        System.out.println("userName:" + userName + "password:" + password);
    }
}
