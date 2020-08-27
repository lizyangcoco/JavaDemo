package com.example.demo.jvm.泛型;

/**
 * 类描述：泛型类
 * 引入一个类型变量T（其他大写字母都可以，不过常用的就是T,E,K,V）等
 * Created by 李泽阳 on 2020/5/18 15:57
 */
public class NormalGeneric<T> {
    private T date;

    public NormalGeneric() {
    }


    public NormalGeneric(T date) {
        this();
        this.date = date;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public static void main(String[] args) {
        NormalGeneric<String> normalGeneric = new NormalGeneric<>();
        normalGeneric.setDate("ver");
        System.out.println(normalGeneric.getDate());
    }
}
