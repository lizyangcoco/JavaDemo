package com.example.demo.Javax0基础.JavaX基础语法.线程.线程练习;


/**
 * Created by 李泽阳 on 2020/4/12 11:32
 */

/**
 * 进程线程概述关系
 * 1、每一个应用程序为一个进程
 * 2、线程为进程的子单元
 * 举例：迅雷下载电影，迅雷为一个进程，下载多部电影，每个电影为一个线程
 * jvm：是多线程的，当程序运行的时候，jvm自动将匿名对象，未引用的对象进行回收
 */
public class CreateThread {


    /**
     * 一：继承创建线程的方式
     * 1、继承 Thread 类进行创建线程
     * 2、重写run方法
     */
    static class threadCreate extends Thread {
        //重写线程命名
        private String name;

        public threadCreate(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            //线程的主运行逻辑
            System.out.println(name + "线程下载");
        }
    }

    /**
     * 二：Runnable创建线程方式
     * 1、实现Runnable接口进行线程的创建
     * 2、必须覆盖重写run的接口
     */
    static class runAbleCreate implements Runnable {
        //重写线程命名
        private String name;

        public runAbleCreate(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            //线程主逻辑
            System.out.println(name + "线程下载");

        }
    }


    //测试线程类代码
    public static void main(String[] args) {
        //一：
        threadCreate threadCreate1 = new threadCreate("线程1");
        threadCreate threadCreate2 = new threadCreate("线程2");
        //threadCreate1.run();//注意调用run方法，是并行执行的
        //应该调用线程的start方法才是启动线程
        threadCreate1.start();
        threadCreate2.start();

        //二：
        Thread thread1 = new Thread(new runAbleCreate("线程1"));
        Thread thread2 = new Thread(new runAbleCreate("线程2"));
        thread1.start();
        thread2.start();
    }
}
