package com.example.demo.jvm.编写优化代码;

/**
 * Created by 李泽阳 on 2020/5/22 17:16
 */
public class VarArgs {
    /**
     * todo 可变参数的谨慎使用
     * 1、可变参数可传null，传空，0，
     * 2、可变参数，1~多个，需要单独的做业务控制
     *
     */

    //累加方法
    static int sum(int first, int... args) {
        int sum = 0;

        if (args.length == 0) {
            //进行异常处理
        }
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
