package com.example.demo.javax0.基础语法.线程.线程练习;

/**
 * 线程使用方法
 * Created by 李泽阳 on 2020/4/14 21:30
 */
public class ThreadPriority implements Runnable {

    @Override
    public void run() {
        //让出线程，cpu在执行时候比较均匀一些，执行完当前任务后，让出cpu
        Thread.yield();
        System.out.println("线程优先级");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPriority());
        Thread t2 = new Thread(new ThreadPriority());
        //
        t2.setPriority(Thread.MAX_PRIORITY);//线程的优先级(优先级10-1，平均为5)
        t1.start();
        try {
            //加入线程必须在，先执行的线程start下面
            t1.join();//加入线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //设置子线程为守护线程，当主线程执行完毕后，子线程进行关闭
        t2.setDaemon(true);
        t2.start();

        System.out.println("主线程结束");

    }
}
