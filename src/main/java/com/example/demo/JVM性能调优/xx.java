package com.example.demo.JVM性能调优;

/**
 * Created by 李泽阳 on 2020/5/8 16:35
 */
public class xx {


    public static void main(String[] args) {

    }

    /**
     * 泛型方法编写
     *
     * @param x
     * @param y
     * @param <T>
     * @return
     */
    public <T extends Number> double add(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }
}
