package com.example.demo.javax0.基础语法.包装类;

/**
 * 包装类：8种基本类型的包装类
 * 应用场景：数据库建立实体映射多用包装类
 *
 * @author 李泽阳 on 2020/1/12 9:52
 */
public class Packing {


    /**
     * 8中基本类型的对应包装类’
     * byte  short  int  long   double  float  boolean  char
     * Byte Short Integer Long Double  Float  Boolean  Character
     *
     *
     *
     * 区别：（举例int，其余相同）
     * 1、int默认为0，integer默认为null
     * 2、int是java的基本数据类型，integer是int的包装类
     * 3、integer必须new，int直接使用
     */

    /**
     * 场景一：创建数据库实体类字段
     * 1、创建一个类型（type），对应数据库的一个字段
     * 2、注意：此存在严重问题，基本类型都默认有值。如int 默认为0
     * 3、那在进行数据库新增的时候，如果不填，则会默认为0。
     * 4、会产生严重的bug，应该改为包装类的引用类型
     */


    // 错误
    private int type;
    // 正确
    private Integer typeT;

    /**
     * 场景二： 自动装箱And自动拆箱
     */
    private void testBox() {
        // 原本转换方式
        int init = 10;
        Integer initTer = new Integer(init);
        int tt = initTer.intValue();

        int i = 10;
        //自动装
        Integer c = i;
        //自动拆
        int ic = c;
    }

    /**
     * 自动装拆箱
     */
    public static void main(String[] args) {
        Integer integer0 = 127;
        Integer integer1 = 127;
        System.out.println(integer0 == integer1);//等于true
        Integer integer2 = 128;
        Integer integer3 = 128;
        System.out.println(integer2 == integer3);//等于false

        /** 源码
         *    public static Integer valueOf(int i) {
         *             if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
         *                 return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
         *             return new Integer(i);
         *         }
         * 通过上我们发现，如果他的int值在最高和最低之间，他直接返回cache内的数据
         * 否则， new Integer(i);
         * 那么最高值：？=high 127 ,最低值：？=low -128,
         * 所以：在-128至127内，他们引用的是缓存内的数据，地址相同，所以为true。超过此则为false
         *
         *     private static class IntegerCache {
         *         static final int low = -128;
         *         static final int high;
         *         static final Integer cache[];
         *
         *         static {
         *             // high value may be configured by property
         *             int h = 127;
         *             String integerCacheHighPropValue =
         *                 sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
         *             if (integerCacheHighPropValue != null) {
         *                 try {
         *                     int i = parseInt(integerCacheHighPropValue);
         *                     i = Math.max(i, 127);
         *                     // Maximum array size is Integer.MAX_VALUE
         *                     h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
         *                 } catch( NumberFormatException nfe) {
         *                     // If the property cannot be parsed into an int, ignore it.
         *                 }
         *             }
         *             high = h;
         *
         *             cache = new Integer[(high - low) + 1];
         *             int j = low;
         *             for(int k = 0; k < cache.length; k++)
         *                 cache[k] = new Integer(j++);
         *
         *             // range [-128, 127] must be interned (JLS7 5.1.7)
         *             assert IntegerCache.high >= 127;
         *         }
         *
         *         private IntegerCache() {}
         *     }
         *
         */
    }

}
