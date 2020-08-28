package com.example.demo.javax0.基础语法.面向对象;

/**
 * 构造器
 *
 * @author 李泽阳 on 2019/12/31 9:36
 */
public class Constructor {
    private String name;
    private String age;

    /**
     * 无参构造器
     */
    public Constructor() {
    }

    /**
     * 场景一：有参数，构造器，重写方法
     */
    public Constructor(String name, String age)   {
        this.name = name;
        this.age = age;
    }

    // 用法：用于重写代码内的函数，用于代码测试
    private void testConstructor() {
        Constructor constructor = new Constructor("name", "18");
    }
}
