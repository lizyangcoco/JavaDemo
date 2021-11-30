package com.example.demo.设计模式.adapter.demo;

import com.example.demo.设计模式.adapter.demo.user.Player;

/**
 * @author by lizyang @on 2021/6/1 22:56
 * @description:
 */
public class Main {


    public void test() {


        Player center = new Translator("中锋");
        center.attack();
        center.defense();

    }
}
