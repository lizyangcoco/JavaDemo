package com.example.demo.jvm.编写优化代码;

/**
 * 类描述：建造者模式
 * Created by 李泽阳 on 2020/5/22 14:27
 */
public class BoxBuilder {
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
    //参数构造方法
    public BoxBuilder(Builder builder) {
        name = builder.name;
        price = builder.price;
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
        e = builder.e;
        f = builder.f;
        g = builder.g;
        h = builder.h;
        i = builder.i;
    }
    //具体的建造者类
    public static class Builder {
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

        //基础构造方法
        public Builder(String name, String price) {
            this.name = name;
            this.price = price;
        }

        //建造方法返回
        public BoxBuilder builder() {
            return new BoxBuilder(this);
        }

        //具体的建造方法
        //...
        public Builder valueA(String value) {
            this.a = value;
            return this;
        }

        public Builder valueB(String value) {
            this.b = value;
            return this;
        }

        public Builder valueC(String value) {
            this.c = value;
            return this;
        }

        public Builder valueD(String value) {
            this.d = value;
            return this;
        }
        //...

    }

    public static void main(String[] args) {
        //创建前面为主类，后面为建造者类
        BoxBuilder builder = new Builder("name", "age")
                .valueA("A").valueB("B").valueC("C").valueD("D").builder();
    }


}
