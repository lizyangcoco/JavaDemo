package com.example.demo.javax0.基础语法.线程.生产者消费者;

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
    public void run() {
        while (true) {
            synchronized (basket) {
                if (!basket.isEmpty()) { //线程池为false有线程进行等待
                    //进行等待
                    try {
                        basket.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("生产者生成线程" + new Date());
                basket.setEmpty(false);
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
