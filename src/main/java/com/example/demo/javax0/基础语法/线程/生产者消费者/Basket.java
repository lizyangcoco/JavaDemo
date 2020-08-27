package com.example.demo.javax0.基础语法.线程.生产者消费者;

/**
 * 线程间的通信：生产者消费者模式
 * Created by 李泽阳 on 2020/4/13 23:51
 */
public class Basket {

    private boolean isEmpty;//默认为false

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
