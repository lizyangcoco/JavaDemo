package com.example.demo.设计模式.adapter.demo.user;

/**
 * @author by lizyang @on 2021/6/1 22:43
 * @description:球员类
 */


public abstract class Player {
    /**
     * fixme 这是所希望的类接口，可以是具体的抽象类，也可以是具体的抽象方法
     */
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 进攻抽象方法
     */
    public abstract void attack();

    /**
     * 防守
     */
    public abstract void defense();

}
