package com.example.demo.jvm.编写优化代码.通用程序设计;

/**
 * 类描述：更好的实现枚举，以及枚举方法
 * Created by 李泽阳 on 2020/5/22 18:43
 */
public class ActiveEnum {

    //枚举实现加减乘除
    public enum betterActive {

        //枚举方法
        PLUS {
            double por(double x, double y) {
                return x + y;
            }
        },
        MINUS {
            double por(double x, double y) {
                return x - y;
            }
        },
        MULTI {
            double por(double x, double y) {
                return x * y;
            }
        },
        DIVIDS {
            double por(double x, double y) {
                return x / y;
            }
        };
        //...可扩充

        abstract double por(double x, double y);


    }

    public static void main(String[] args) {
        //多枚举方法使用
        betterActive.PLUS.por(1, 2);
        System.out.println(betterActive.PLUS.por(1, 2));
    }
}
