package com.example.demo.JVM性能调优.编写优化代码.方法;

/**
 * Created by 李泽阳 on 2020/5/22 17:29
 */
public class StandardException {

    /**
     * todo 异常使用采用标准异常，能不用自定义异常便不用
     *
     */
    public void test(int count) {

        if (count < 0) {//调用传递的参数不正确异常
            throw new IllegalArgumentException("调用传递的参数不正确异常");
        }
        if (count != 1) {//接受的对象状态不对
            throw new IllegalStateException("调用传递的参数不正确异常");
        }
        Object obj = new Object();
        if (obj == null) {//接受的对象为空
            throw new NullPointerException("接受的对象为空");
        }
    }
}
