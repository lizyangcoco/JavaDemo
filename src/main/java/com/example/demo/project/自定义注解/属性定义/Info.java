package com.example.demo.project.自定义注解.属性定义;

import java.lang.annotation.*;

/**
 * @description：
 * @Created by 李泽阳 @on 2020/8/27 18:34
 */
@Documented
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
    String value() default "tracy";

    boolean isDelete() ;

}
/**
 * @Target类型
 *         描述
 *         ElementType.TYPE
 *         应用于类、接口（包括注解类型）、枚举
 *         ElementType.FIELD
 *         应用于属性（包括枚举中的常量）
 *         ElementType.METHOD
 *         应用于方法
 *         ElementType.PARAMETER
 *         应用于方法的形参
 *         ElementType.CONSTRUCTOR
 *         应用于构造函数
 *         ElementType.LOCAL_VARIABLE
 *         应用于局部变量
 *         ElementType.ANNOTATION_TYPE
 *         应用于注解类型
 *         ElementType.PACKAGE
 *         应用于包
 *         ElementType.TYPE_PARAMETER
 *         1.8版本新增，应用于类型变量）
 *         ElementType.TYPE_USE
 *         1.8版本新增，应用于任何使用类型的语句中（例如声明语句、泛型和强制转换语句中的类型）
 *
 * @Retention
 *           表明该注解的生命周期
 *           生命周期类型
 *           描述
 *           RetentionPolicy.SOURCE
 *           编译时被丢弃，不包含在类文件中
 *           RetentionPolicy.CLASS
 *           JVM加载时被丢弃，包含在类文件中，默认值
 *           RetentionPolicy.RUNTIME
 *           由JVM 加载，包含在类文件中，在运行时可以被获取到
 */

