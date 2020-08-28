package com.example.demo.jvm.编写优化代码;

/**
 * Created by 李泽阳 on 2020/5/22 14:12
 */
public class Box {
    /**
     * todo 构造器太多的优化方法
     * <p>
     * 缺点：
     * 1、构造方法多，
     * 2、参数多
     * 3、不易扩展
     */
    private String name;
    private String price;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    //可拓展参数
    //...


    //全参数构造器
    public Box(String name, String price, String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        this.name = name;
        this.price = price;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }

    /**
     * 优化，只构造相应的必须参数，使用javaBean数据，其余用set，get方法设置
     * 缺点：一致性，并发编程，不能一行构造完成
     */
    public Box(String name, String price) {
        this.name = name;
        this.price = price;
    }

     /**
     * 优化：使用Builder模式
     * todo 建造者模式----类BoxBuilder内
     */


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

}
