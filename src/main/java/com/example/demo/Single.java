package com.example.demo;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;

public class Single {


    private Single params1;
    private Single params2;
    private static Single single;

    // 私有化构造器
    private Single() {
    }


    // 提供唯一对外构造器
    public static Single getInstance() {
        // 避免不必要加锁开销
        if (null == single) {
            // 解决线程安全
            synchronized (Single.class) {
                if (null == single) {
                    return new Single();
                }
            }
        }
        return single;
    }


    public Single getParams1() {
        return params1;
    }

    public void setParams1(Single params1) {
        this.params1 = params1;
    }

    public Single getParams2() {
        return params2;
    }

    public void setParams2(Single params2) {
        this.params2 = params2;
    }


    public static void main1(String[] args) {
        // 题目：给定一个整数数组，求所有正整数的平方根和
        int[] arrays = new int[]{1, 2, 3, 4, 5, 6};
        double result = Arrays.stream(arrays).mapToDouble(Math::sqrt).sum();
        // fixme 保留小数
        System.out.println(result);

    }


    public static void main(String[] args) {
        // 题目：有一个英文文档，只有英文单词和空格以及常见的英文标点符号[,.]
        // 写一段程序，读取该文件，输出次数前三多的单词，以及他们出现的次数

    }


}
