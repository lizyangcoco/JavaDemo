package com.example.demo.javax0.基础语法.函数数组;

/**
 * String stringBuffer StringBuilder 的线程创建，以及安全问题
 * 应用场景：基础应用，sql拼接，字符串定义等。。。
 *
 * @author 李泽阳 on 2019/12/31 18:34
 */
public class StringBufferBuilder {

    /**
     * String陷阱
     * 如果多次执行这些方法，改变字符串的内容，
     * 会产生大量的文本，留在内存中，从而降低效率
     * 如果这些操作放在forEach循环内，更会降低效能
     */
    private void strings() {
        for (int i = 0; ; i++) {

            // 创建一个对象,hello
            String str = "hello";

            // 再创建一个对象,word
            str = str + "word";

            // 最后创建，一个对象 hello word
            System.out.println(str);
        }

    }

    /**
     * StringBuffer解决了以上问题 线程安全，速度慢
     */
    private void stringBuffer() {
        // 创建一个对象，此安全线程
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("hello");
        stringBuffer.append("word");

        /**
         * append源码：
         *  public synchronized StringBuffer append(String str) {
         *         toStringCache = null;
         *         super.append(str);
         *         return this;
         *     }
         */
        // 线程安全原因：对单次操作进行了synchronized加锁操作
        // 所以线程为安全线程,但是速度慢，多用于多线程
    }




    /**
     * StringBuilder同理解决问题 线程不安全，速度快
     */
    private void testStringBuilder() {
        // 线程不安全
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");
        stringBuilder.append("word");

        /**
         * append源码：
         *   public StringBuilder append(String str) {
         *         super.append(str);
         *         return this;
         *     }
         */

        // 线程安全问题：未对线程进行加锁，所以只能用于单线程
    }


    /**
     * 1、String str1="demo" 和 String str2=new String("practic") 的区别？
     *
     * 答：1）存储的位置不同。String 是存储在常量池，new在堆中开辟空间。
     *
     * String str="demo"可能创建1个或不创建对象，先去常量池找是否存在，存在不创建，不存在创建。
     *
     * String str=new String("practic") 至少一个，必创tr2对象，"practic"同上一样。
     */

}
