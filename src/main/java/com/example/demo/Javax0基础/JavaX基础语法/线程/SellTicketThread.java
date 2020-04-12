package com.example.demo.Javax0基础.JavaX基础语法.线程;

/**
 * 多窗口并发出售车票
 * Created by 李泽阳 on 2020/4/12 16:30
 */
public class SellTicketThread {

    /**
     * 继承Thread类的实现
     */
    static public class SellTicketT extends Thread {
        private String name;
        //创建锁对象，这个对象是多个线程共享的对象
        Object obj = new Object();

        public SellTicketT(String name) {
            this.name = name;
        }
        static int tickets = 100;
        @Override
        public void run() {
            while (true) {
                synchronized (obj) {
                    if (tickets > 0) {
                        System.out.println(name + "卖出票" + (tickets--));
                    } else {
                        break;
                    }
                }
            }
            System.out.println(name + "卖票结束");
        }
    }


    /**
     * 接口RunAble类的实现
     */
    static class SellTickR implements Runnable {
        private String name;

        public SellTickR(String name) {
            this.name = name;
        }

        static int tickets = 100;
        //创建锁对象,这个对象是多个线程共享的对象
        Object obj = new Object();

        @Override
        public void run() {
            while (true) {
                synchronized (obj) {
                    if (tickets > 0) {
                        System.out.println(name + "卖出票" + (tickets--));
                    } else {
                        break;
                    }
                }
            }
            System.out.println(name + "卖票结束");
        }
    }

    public static void main(String[] args) {
        SellTicketT s1 = new SellTicketT("窗口1");
        SellTicketT s2 = new SellTicketT("窗口2");
        SellTicketT s3 = new SellTicketT("窗口3");
        s1.start();
        s2.start();
        s3.start();
    }

}
