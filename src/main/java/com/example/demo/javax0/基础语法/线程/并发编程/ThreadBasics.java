package com.example.demo.javax0.基础语法.线程.并发编程;

/**
 * 线程基础：
 * Created by 李泽阳 on 2020/4/15 10:20
 */
public class ThreadBasics {

    /**
     * 1、进程和线程的区别？
     * 答：进程是操作系统调度的最小单位，线程是cpu调度的最小调度单位
     * 线程共享进程的资源，例如：迅雷下载电影。。。OS限制：Linux(max)1000个，Windows(max)2000个，线程
     * 好处：充分利用cpu资源，单线程下载其他全部等待，模块化，异步化。
     * <p>
     * <p>
     * 2、cpu核心数和线程数的关系？
     * 答：os的超线程技术，1：2
     * <p>
     * <p>
     * 3、cpu时间片轮转机制？
     * 答：给每个线程分配时间片段，上下文切换，代价大：2w个cpu的周期（编写代码尽量避免）
     * <p>
     * <p>
     * 4、并行和并发？
     * 答：并发（单位时间内的并发量），应用并发交替使用
     * 并行（同时执行）
     * <p>
     * <p>
     * 5、线程的两种启动方式，Thread、runnable的区别？
     * 答：Thread是线程的抽象，runnable是具体任务的抽象
     * <p>
     * <p>
     * 6、线程的stop()强制终止为什么不建议使用？
     * 答：因为它的终止方式非常的野蛮，直接关闭，可能导致线程占用的锁资源不释放，形成死锁。
     * <p>
     * <p>
     * 7、线程run()和start()的区别？
     * 答：run()，普通方法多次调用，start()单次调用，线程就绪真正启动线程。
     * run(),主线程调用不启动子线程，start()，启动子线程
     * <p>
     * <p>
     * 8、内置锁的对象必须保持不变 Integer 为啥不行？
     * 答：Integer在每次返回的时候，都会创建new新的对象。
     * <p>
     * <p>
     * 9、为何不建议使用自定义中断？而使用interrupt()
     * 答：自定义中断，里面进行wait(),或者进行休眠，不满做条件不会出来，不会中断。
     * 而，jdk的sleep、wait 等线程继承了中断异常
     * <p>
     * <p>
     * 10、守护线程setDaemon(true)；run()里面的finally一定执行吗？
     * 答：不一定执行，守护线程随着主线程关闭而关闭。
     * <p>
     * <p>
     * 11、对象锁，类锁，synchronized？是什么
     * 答：共有对象进行加锁，类锁是static的方法上枷锁，是实例创建的类锁。
     */


    // 线程的实现方式一： extends Thread
    public static class UsThread extends Thread {

        String threadName = Thread.currentThread().getName();
        // 内置锁，锁对象用的
        Object obj = new Object();

        // 为何不采用 Integer 进行加锁   return new Integer(i);
        /**
         * integer  valueOf源码
         * public static Integer valueOf(int i) {
         * if (i >= IntegerCache.low && i <= IntegerCache.high)
         * return IntegerCache.cache[i + (-IntegerCache.low)];
         * return new Integer(i);
         * }
         */
        Integer integer;

        // 自定义中断，错误使用方法
        private static boolean isStop = false;

        public static boolean isIsStop() {
            return isStop;
        }

        public static void setIsStop(boolean isStop) {
            UsThread.isStop = isStop;
        }

        // 运行方法
        @Override
        public void run() {
            // integer失败原因：创建新的对象
            //synchronized (integer) {

            // 锁对象，必须保持不变
            synchronized (obj) {
                while (!isInterrupted()) {//检查中断标识位
                   /* while (isStop) {
                        // 错误使用方法,自定义boolean，错误的
                        try {
                            // 等待，或者，休眠，不会感知自定义的中断位------9
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }*/
                    System.out.println(threadName);
                }
            }
        }
    }

    // 线程的实现方式二：implements Runnable
    public static class UsRunnable implements Runnable {

        String threadName = Thread.currentThread().getName();

        /**
         * 线程的其他操作方法
         * 1、让出线程，让出cpu的时间片段，不让其他资源
         * 2、睡眠线程
         * 3、等待线程
         * 4、加入线程
         * 5、守护线程，随着主线程进行
         */
        @Override
        public void run() {
            try {
                // 让出线程
                Thread.yield();
                // 线程的睡眠
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 获取当前线程进行中断
            while (Thread.currentThread().isInterrupted()) {
                System.out.println(threadName);
            }
        }
    }

    // 类锁
    public synchronized void te_Syn() {
        // 对象锁
        synchronized (this) {
            System.out.println("");
        }

    }

    // 线程的启动
    public static void main(String[] args) {
        // 方式一：
        UsThread t1 = new UsThread();
        t1.start();


        // 方式二： 匿名对象调用
        UsRunnable usRunnable = new UsRunnable();
        Thread t2 = new Thread(usRunnable);


        /**
         * 线程的终止
         * 1、stop()
         * 2、interrupt()、isInterrupted()、interrupted()
         * 三者区别，interrupt()线程的中断标识位，isInterrupted()检查线程的中断标识位,interrupted(),检查并修改为false
         */
        // 强行终止，不建议使用，资源不正常释放造成死锁，过于野蛮。
        t1.stop();
        // 中断线程，设置标识位将其改为true
        t1.interrupt();
        t2.interrupt();

        // 线程其他的方法
        try {
            // 守护线程
            t1.setDaemon(true);
            // 加入线程--之前的所以线程都加入
            t2.join();
            // 阻塞等待线程
            t1.wait();
            // 线程的优先级--平均5
            t1.setPriority(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
