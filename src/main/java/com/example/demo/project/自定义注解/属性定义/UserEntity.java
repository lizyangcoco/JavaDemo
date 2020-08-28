package com.example.demo.project.自定义注解.属性定义;

import lombok.Data;

/**
 * @description：
 * @Created by 李泽阳 @on 2020/8/27 18:21
 */
@Data
@Info(isDelete = true)
public class UserEntity {
    private String name;
    private String age;
    private boolean isDelete;


    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}

