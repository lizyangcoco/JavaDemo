package com.example.demo.utils;

/**
 * @author by lizyang @on 2021/6/20 15:46
 * @description:
 */
public class User1 implements People {

    @Override
    public void sleep() {
        System.out.println("user111111111111在睡觉");

    }

    @Override
    public void eat() {
        System.out.println("user111111111111吃饭");
    }
}
