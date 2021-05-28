package com.example.demo.annotation;

/**
 * @author by lizyang @on 2021/5/27 17:54
 * @description:自定注解，说明类
 */
public @interface Annotation {
    // 入参值
    String value() default "";
    // 是否开启

    boolean hasOpen() default false;
}
