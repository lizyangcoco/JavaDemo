package com.example.demo.javax0.设计模型.单例模型;

/**
 * 设计模型之——>单例设计模型
 * 创建型模式
 *
 * @author 李泽阳 on 2019/12/31 9:49
 */
public class SingleModel {

    /**
     * 单例设计模型：
     * 解决问题：在jvm虚拟机内，只许创建一个对象（保证一个类仅有一个实例，并提供一个访问它的全局访问点）
     * <p>
     * <p>
     * 设计思想：
     * 1、私有化默认构造器，不让外界无限访问创建
     * 2、提供单个访问接口
     * 3、首次创建对象类，采用懒加载
     * <p>
     * 优点：对外保证一个实例对象
     * 缺点：多线程同时访问，可能造成多个实例
     * <p>
     * 应用场景：
     * 参数、多出应用的参数、
     * *
     */
    private String name;
    private String age;
    //2、
    private static SingleModel singleModel;

    //1、私有化构造器:
    //注意：一般开发中，如果要创建，设为public
    private SingleModel() {
    }

    //3、创建外部访问对象
    public static SingleModel getInstance() {
        if (singleModel == null) {
            //懒加载
            return new SingleModel();
        }
        return singleModel;
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
