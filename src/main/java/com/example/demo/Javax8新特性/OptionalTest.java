package com.example.demo.Javax8新特性;

import com.example.demo.utils.DemoEntity;
import com.example.demo.utils.DemoEntitySon;

import java.util.Optional;

/**
 * 函数：Optional 判断空处理
 * <>解决臭名昭著的判空处理</>
 *
 * @author 李泽阳 on 2020/1/10 10:13
 */
public class OptionalTest {


    /**
     * 场景一：
     * 获得实体对象的某个值
     */
    private String getDemoEntityDeName1(DemoEntity demoEntity) {
        if (demoEntity != null) {
            DemoEntitySon demoEntitySon = demoEntity.getDemoEntitySon();
            if (demoEntitySon != null) {
                String strName = demoEntitySon.getDeName();
                if (strName != null) {
                    return strName;
                }
            }
        }
        return null;
    }

    //改进写法
    private String getDemoEntityDeName2(DemoEntity demoEntity) {
        return Optional.ofNullable(demoEntity)
                .map(DemoEntity::getDemoEntitySon)
                .map(DemoEntitySon::getDeName).orElse(null);
    }

    /**
     * 场景二：
     * 判断对象或者字符是否为空，为空返回false，非空true
     */
    private boolean getBoType1() {
        String type = null;
        if (type == null) {
            return false;
        } else {
            return true;
        }
    }

    //改进写法
    private boolean getBoType2() {
        String type = null;
        return Optional.ofNullable(type).isPresent();
        /**
         * 源码：
         * public boolean isPresent() {
         *         return value != null;
         *     }
         */
    }

    //of方法源码
    private void testOf() {
        //这里一定会抛出异常
        DemoEntity demoEntity = null;
        Optional.of(demoEntity);
        /** 源码：为null直接抛空指针异常
         * public static <T> T requireNonNull(T obj) {
         *         if (obj == null)
         *             throw new NullPointerException();
         *         return obj;
         *     }
         */
    }

    //OfNullable源码
    private void testOfNullable() {
        DemoEntity demoEntity = null;
        Optional.ofNullable(demoEntity).orElse(null);
        /**   源码：直接判空和of判断
         *    public static <T> Optional<T> ofNullable(T value) {
         *         return value == null ? empty() : of(value);
         *     }
         */
    }


}
