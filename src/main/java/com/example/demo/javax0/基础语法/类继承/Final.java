package com.example.demo.javax0.基础语法.类继承;

/**
 * Final  关键字，不可修改，需要定义，不可被重写，不可继承
 * 应用场景：常量的定义，不可继承的编写
 *
 * @author 李泽阳 on 2020/1/1 10:53
 */
public class Final {

    /**
     * 场景一：运用在局部变量上，数据不可再更改
     */
    private void testVariable() {

        for (int i = 0; ; i++) {
            final int variableK;
            // variableK不可再更改
            variableK = 10;
        }
    }


    /**
     * 场景二：运用在成员属性上，必须初始化定义值
     */
    class testMembers {
        private final String TEST_MEMBERS = "NUMBER_CODE";

    }


    /**
     * 场景三： 运用在方法上，不可被子类重写
     */
    // 父类
    class testClassParent {
        public final void testClass() {
            System.out.println("isParent");
        }
    }


    // 子类
    class testClassSon extends testClassParent {
        // 继承不可被重写
        /*public void testClass() {
            System.out.println("isSon");
        }*/
    }




    /**
     * 场景四： 运用在类上，类不可被继承
     */
    // 父类
    final class testClass {
        public final void testClass() {
            System.out.println("c");
        }
    }

    /*// 子类 不可被继承
    class testSon extends testClass {
    }*/


}
