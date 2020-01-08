package com.example.demo.Javax0基础.JavaX基础语法.异常;

import javax.jws.WebService;

/**
 * 异常 分为：运行异常，编译异常
 * 自定义异常的写法
 *
 * @author 李泽阳 on 2020/1/8 9:42
 */
public class Exception {
    /**
     * 场景一：
     * 运行异常一般向上抛出，尤其为写公共接口等，
     * 例如：编写一个获取字符串数组内某个字符
     */

    public void ExceptionTest() {
        String[] strArr = {"1", "2", "3"};
        try {
            //在这里进行，异常捕获
            String str = PrintArrayToString(strArr, 5);
            System.out.println("返回的字符是：" + str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 公共获取数组内固定的某值
     *
     * @param arrays 数组
     * @param sub    获取下标号
     * @return
     * @throws java.lang.Exception
     */
    public String PrintArrayToString(String[] arrays, int sub) throws java.lang.Exception {
        //在这里，便会存在数据越界问题，
        //不予捕获处理，向上抛出异常
        String str = arrays[sub];
        return str;
    }


    /**
     * 场景二：
     * 自定义异常的写法
     * 1、创建异常类继承RuntimeException，覆盖其中的方法
     * 2、在特定的条件下throw new 创建的异常，向上抛出
     */

    public static void main(String[] args) {
        try {
            calculateDivision(10, 0);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

    }

    //计算除法division,throws java.lang.Exception,除了自定义异常外，其余异常继续向上抛出
    private static int calculateDivision(int a, int b) throws java.lang.Exception {
        //在这里定义，自定义异常
        if (b == 0) {
            throw new customException("被除数不能为0");
        }
        int c = a / b;
        return c;
    }

    //继承运行异常，复写其中的方法
    static class customException extends RuntimeException {
        public customException() {
            super();
        }

        public customException(String message) {
            super(message);
        }

        public customException(String message, Throwable cause) {
            super(message, cause);
        }

        public customException(Throwable cause) {
            super(cause);
        }

        protected customException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
