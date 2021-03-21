package com.example.demo.mybatis.开发重点知识;

import com.example.demo.myBatis.开发重点知识.MyBatisMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by 李泽阳 @on 2021/3/6 20:14
 * @description:
 */
public class MyBatis快速入门 {
    @Autowired
    private MyBatisMapper myBatisMapper;

    /**
     * 1、ORM框架是什么？持久层框架
     * 2、mybatis的三种传参形式
     * 3、sql元素 简写，sql参数
     * 4、#和${} 区别：#会进行预编译，''两个冒号
     * 5、动态sql元素 if chose when otherwise Trim where set foreach
     * 6、
     */

    private void moreParams() {
        // 第一种map::禁止使用
        Map<String, Object> paramsMap = new HashMap<>(0);
        paramsMap.put("email", 1);
        paramsMap.put("phone", 1);
        myBatisMapper.getListToMap(paramsMap);
        // 第二种注解多参数
        myBatisMapper.getListToParams("t1");
        // 第三种bean对象
        myBatisMapper.getListToBean(new Object());
    }


}