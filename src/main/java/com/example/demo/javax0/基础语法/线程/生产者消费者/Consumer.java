package com.example.demo.javax0.基础语法.线程.生产者消费者;

import lombok.SneakyThrows;

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
     * 线程之间通信的注意:
     * 1、通信之间的对象一定要加 synchronized 锁
     * 2、一定要有等待，wait(),和 notify()唤醒线程
     * 3、生产者消费者一定要在true之中
     */

    @Override
    @SneakyThrows
    public void run() {
        while (true) {

            synchronized (basket) {
                // 篮子为空
                if (basket.isEmpty()) {
                    // 进行等待
                    basket.wait();
                }

                System.out.println("消费者消费线程" + new Date());
                basket.setEmpty(true);
                // 线程的通知唤醒
                basket.notify();
            }
            // 睡眠线程在synchronized外，不影响cpu的消耗
            Thread.sleep(1000);

        }
    }
}
