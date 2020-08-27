package com.example.demo.javax0.基础语法.线程.并发编程;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by 李泽阳 on 2020/4/15 10:35
 */
public class OnlyMain {
    public static void main(String[] args) {
        //Java 虚拟机线程系统的管理接口
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取同步的monitor和synchronized信息，仅仅获取线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo t : threadInfos) {
            //打印线程id，和线程名称
            System.out.println(t.getThreadId() + t.getThreadName());
            //6Monitor Ctrl-Break
            //5Attach Listener
            //4Signal Dispatcher
            //3Finalizer
            //2Reference Handler
            //1main
        }
        //Finalizer，线程为守护线程,所以释放资源不靠谱
    }
}
