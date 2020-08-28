package com.example.demo.project.自定义注解.过滤接口;

import java.lang.annotation.*;

/**
 * @description：
 * @Created by 李泽阳 @on 2020/8/27 16:16
 */

@Documented// 可被javadoc生成文档
@Target(ElementType.METHOD)// 作用范围
@Retention(RetentionPolicy.RUNTIME) // 生命周期
public @interface NotLogin {
}
