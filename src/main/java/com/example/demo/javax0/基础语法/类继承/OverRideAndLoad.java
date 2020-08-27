package com.example.demo.javax0.基础语法.类继承;

/**
 * 方法的重写And重载
 * 应用场景：重写，重载
 *
 * @author 李泽阳 on 2020/1/1 10:42
 */
public class OverRideAndLoad {
    /*
     *重写：重写父类的方法，一般是父类满足不了子类的方法，需求进行重写，方法体不同
     *重载：重载是同一个类中，有着相同方法名，不同参数的叫重载。
     */
    //重写
    class person {
        public void save() {
            long sys = System.currentTimeMillis();

        }

        //重载：同一个类中，的方法，参数不同
        public void save(String id) {
            long sys = System.currentTimeMillis();

        }
    }

    class student extends person {
        //这里是继承类中的方法重写
        public void save() {
            long sys = System.currentTimeMillis();

        }
    }


}
