package com.example.demo.javax0.基础语法.线程.生产者消费者;

import java.util.Date;

/**
 * 消费者端：消耗线程
 * Created by 李泽阳 on 2020/4/14 0:06
 */
public class Consumer extends Thread {
    /**
     * 共享的资源池
     */
    private Basket basket;

    public Consumer(Basket basket) {
        this.basket = basket;
    }

    /**
     * 线程之间通信的注意
     * 1、通信之间的对象一定要加 synchronized 锁
     * 2、一定要有等待，wait(),和 notify()唤醒线程
     * 3、生产者消费者一定要在true之中
     */
    @Override
    public void run() {
        while (true) {
            synchronized (basket) {
                if (basket.isEmpty()) {
                    try {
                        basket.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者消费线程" + new Date());
                basket.setEmpty(true);
                basket.notify();//线程的通知唤醒
            }
            //睡眠线程在外，不影响cpu的消耗
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
