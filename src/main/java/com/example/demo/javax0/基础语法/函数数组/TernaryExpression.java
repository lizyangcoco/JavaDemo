package com.example.demo.javax0.基础语法.函数数组;

/**
 * 三元运算表达符
 * 应用场景：缩写多重if else 条件语句
 *
 * @author 李泽阳 on 2019/12/30 19:49
 */
public class TernaryExpression {


    int source = 90;

    public void operatorTest() {
        String type = "";


        /**
         * 场景一:单if
         */
        if (source > 85) {
            type = "A";
        } else {
            type = "B";
        }

        // 改进：三元表达式优化***数据类型***，由扣号内的数据确定
        type = source > 85 ? ("A") : ("B");
        System.out.println(type);


        /**
         * 场景二：多if
         */
        if (source > 85) {
            type = "A";
        } else if (source > 75) {
            type = "B";
        } else {
            type = "C";
        }
        // 改进
        type = source > 85 ? ("A") : (source > 75 ? ("B") : ("C"));

    }
}
