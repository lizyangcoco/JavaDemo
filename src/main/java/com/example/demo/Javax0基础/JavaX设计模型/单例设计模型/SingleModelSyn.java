package com.example.demo.Javax0基础.JavaX设计模型.单例设计模型;

/**
 * 设计模型之——>单例设计模型
 * 创建型模式
 *
 * @author 李泽阳 on 2019/12/31 9:49
 */
public class SingleModelSyn {

    /**
     * 改进：多个线程加载，创建多个实例,以及线程锁开销
     *
     */
    private String name;
    private String age;

    private static SingleModelSyn singleModel;

    //私有化构造器:
    private SingleModelSyn() {

    }

    //创建外部访问对象
    public static SingleModelSyn getInstance() {
        //解决线程上下文切换，所产生的时间开销
        if (singleModel == null) {
            //加锁线程锁，解决多线程创建多个实例
            synchronized (SingleModelSyn.class) {
                if (singleModel == null) {
                    //懒加载
                    return new SingleModelSyn();
                }
            }
        }
        return singleModel;
    }
    /*//饿汉模式：以空间换时间做法
    private static SingleModelProSyn singleModel = new SingleModelProSyn();

    private SingleModelProSyn() {
    }

    public static SingleModelProSyn getInstance() {
        return singleModel;
    }*/


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
