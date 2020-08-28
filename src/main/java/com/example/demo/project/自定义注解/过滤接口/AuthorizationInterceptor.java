package com.example.demo.project.自定义注解.过滤接口;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description：权限(token)校验
 * @Created by 李泽阳 @on 2020/8/27 16:22
 */
@Slf4j
@Component
public class AuthorizationInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 检查接口是否要登录
        if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            // 是否具有自定义标签
            NotLogin annotation = handlerMethod.getMethodAnnotation(NotLogin.class);
            if (annotation != null) {
                return true;
            }
        }
        return true;
    }


}
