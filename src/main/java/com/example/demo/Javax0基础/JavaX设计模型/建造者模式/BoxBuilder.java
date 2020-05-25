package com.example.demo.Javax0基础.JavaX设计模型.建造者模式;

import com.example.demo.JVM性能调优.编写优化代码.Box;

/**
 * Created by 李泽阳 on 2020/5/22 14:49
 */
public class BoxBuilder {
    /**
     * todo 建造者模式
     * 将多个构造参数，编写成链式的写入方法
     * <p>
     * 操作步骤：
     * 1、创建具体的建造者
     * 2、创建传入基本参数
     * 3、创建建造方法返回
     * 4、具体建造方法扩展
     * <p>
     * <p>
     * 优势：参数是可选的，代码易于读写，编写。更加安全
     */


    private String A;
    private String B;
    private String C;
    private String D;

    public BoxBuilder(builder builder) {
        A = builder.A;
        B = builder.B;
        C = builder.C;
        D = builder.D;
    }


    //1、创建具体的建造者
    public static class builder {
        private String A;
        private String B;
        private String C;
        private String D;

        //2、创建基础构造方法
        public builder(String value) {
            A = value;
        }

        //3、创建方法返回
        public BoxBuilder builder() {
            return new BoxBuilder(this);
        }

        //4、创建具体的方法
        public builder valueA(String valueA) {
            this.A = valueA;
            return this;
        }

        public builder valueB(String valueB) {
            this.B = valueB;
            return this;
        }
        //可扩展参数
        //...
    }

    public static void main(String[] args) {
        BoxBuilder builder0 = new builder("all").builder();
        BoxBuilder builder1 = new builder("all").valueA("A").builder();
        BoxBuilder builder2 = new builder("all").valueA("A").valueB("B").builder();
    }
}
