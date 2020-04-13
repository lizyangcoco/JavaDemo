package com.example.demo.Javax0基础.JavaX基础语法.线程.生产者消费者;

/**
 * Created by 李泽阳 on 2020/4/14 0:17
 */
public class Test {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Consumer consumer = new Consumer(basket);
        Producer producer = new Producer(basket);
        consumer.start();
        producer.start();

    }
}
