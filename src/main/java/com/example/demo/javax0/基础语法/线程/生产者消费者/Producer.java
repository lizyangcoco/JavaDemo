package com.example.demo.javax0.基础语法.线程.生产者消费者;

import lombok.SneakyThrows;
import lombok.Synchronized;

import java.util.Date;

/**
 * 生产者端:制造线程
 * Created by 李泽阳 on 2020/4/13 23:55
 */
public class Producer extends Thread {

    /**
     * 共享的资源池
     */
    private Basket basket;

    public Producer(Basket basket) {
        this.basket = basket;
    }

    @Override
    @SneakyThrows
    public void run() {
        while (true) {
            synchronized (basket) {

                // 线程池为false有线程进行等待
                if (!basket.isEmpty()) {
                    //进行等待
                    basket.wait();
                }

                System.out.println("生产者生成线程" + new Date());
                basket.setEmpty(false);
                // 线程的通知唤醒
                basket.notify();
            }
            // 睡眠线程在外，不影响cpu的消耗
            Thread.sleep(1000);

        }
    }
}
