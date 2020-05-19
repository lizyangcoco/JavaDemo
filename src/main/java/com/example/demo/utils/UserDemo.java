package com.example.demo.utils;

/**
 * Created by 李泽阳 on 2020/5/18 17:21
 */
public class UserDemo {
    private String name;
    private int age;

    public UserDemo() {
    }

    public UserDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
