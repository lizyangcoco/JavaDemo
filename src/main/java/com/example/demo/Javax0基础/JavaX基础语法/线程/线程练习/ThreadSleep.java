package com.example.demo.Javax0基础.JavaX基础语法.线程.线程练习;

/**
 * ThreadSleep 线程的休眠特点
 * Created by 李泽阳 on 2020/4/13 23:22
 */
public class ThreadSleep {

    static class sleepT implements Runnable {
        static Object obj = new Object();//静态锁对象

        @Override
        public void run() {
            while (true) {
                synchronized (obj) {
                    try {
                        /**
                         * 注意：如果休眠在synchronized内不会让出CPU
                         */
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

}
