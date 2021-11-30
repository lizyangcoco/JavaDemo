package com.example.demo.utils;

/**
 * @author by lizyang @on 2021/6/20 15:46
 * @description:
 */
public class User implements People {

    @Override
    public void sleep() {
        System.out.println("user在睡觉");

    }

    @Override
    public void eat() {
        System.out.println("user吃饭");
    }
}
