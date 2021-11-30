package com.example.demo.设计模式.adapter.demo;

import com.example.demo.设计模式.adapter.demo.user.Player;

/**
 * @author by lizyang @on 2021/6/1 22:53
 * @description:翻译类
 */
public class Translator extends Player {
    /**
     * fixme 把需要翻译的类全部引用进来
     */
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
    }
    /**
     * fixme 这里翻译的为抽象类里的方法
     */
    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
