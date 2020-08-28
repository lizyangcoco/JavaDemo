package com.example.demo.javax0.设计模型.单例模型;

import java.util.HashMap;
import java.util.Map;

/**
 * 设计模型之——>单例设计模型
 * 创建型模式
 *
 * @author 李泽阳 on 2019/12/31 9:49
 */
public class SingleModelPro {

    /**
     * 改进：单例创建多个单例对象
     */
    private String name;
    private String age;
    private static int maxNumberSingleModelProTow = 2;//最大创建数
    private static int number = 1;//首次创建个数
    // 创建一个map集合，用来存储创建好的实例
    public static Map<String, SingleModelPro> singleModelMap = new HashMap<>();

    // 私有化构造器:
    private SingleModelPro() {

    }

    // 创建外部访问对象
    public static SingleModelPro getInstance() {
        // 直接获取静态key值
        SingleModelPro singleModelPro = singleModelMap.get(number);
        if (singleModelPro == null) {
            // 如果为空，new一个对象，number做key，对象做value
            singleModelPro = new SingleModelPro();
            singleModelMap.put(number + "", singleModelPro);
        }
        number++;
        // 循环在1-2之间
        if (number > maxNumberSingleModelProTow) {
            number = 1;
        }

        return singleModelPro;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
