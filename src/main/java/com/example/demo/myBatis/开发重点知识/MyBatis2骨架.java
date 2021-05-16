package com.example.demo.myBatis.开发重点知识;

import com.example.demo.dao.model.JsonUser;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author by 李泽阳 @on 2021/3/21 22:38
 * @description:
 */
public class MyBatis2骨架 {
    @Autowired
    private MyBatisMapper myBatisMapper;

    /**
     * mybatis的一二级缓存？ 缓存：避免频繁数据库交互
     *  一级缓存：默认开启、生命周期：一个 sqlSession 的生命周期内一个线程内的，同一个sqlSession（键值：由方法和入参和sql组成）将键值和查询结果存入map内，下一个直接查询。
     *  任何的insert、update、delete 操作都会清空一级缓存
     *
     *  二级缓存：也叫应用缓存 以一个nameSpace为单元进行缓存，长驻缓存
     *  任何的insert、update、delete 操作都会清空一级缓存
     *  tips:二级缓存更容易出现脏读，避免使用二级缓存，改为可控制缓存，redis
     *
     *  缓存：sqlSessionFactory
     *  sqlSession 一级缓存
     *  sqlSession 一级缓存
     *  以一个nameSpace为空间的二级缓存
     *  先访问二级缓存，再访问一级缓存，再查询数据库
     *
     *  缓存调用过程解读：
     *  1、每次与数据库的链接都会优先从缓存中获取数据
     *  2、先查二级缓存，再查一级缓存
     *  3、二级缓存以namespace为单位的，是sqlSession共享的，容易出现脏读，建议避免使用二级缓存，
     *  4、一级缓存是sqlSession独享的，建议开启。
     *
     */
    /**
     * 骨架
     * 1、单一职责原则：一个类或者一个接口负责唯一项职责，尽量设计出功能单一的接口
     * 2、依赖倒转原则：
     * 3、开放封闭原则：
     * 4、迪米特原则：
     *
     * 5、里氏代换原则
     * 6、接口隔离原则
     */

    /**
     * 日志模块
     */
    private void mybatisT8() {
        // 日志模块
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();

    }

    /**
     * 数据源
     */
    private void mybatisT1() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    /**
     * 事务管理
     */
    private void mybatisT2() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    /**
     * 缓存
     */
    private void mybatisT3() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    /**
     * Binding模块
     */
    private void mybatisT4() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    private void mybatisT5() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    /**
     * 反射
     */
    private void mybatisT6() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    /**
     * 类型转换
     */
    private void mybatisT7() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    /**
     * 资源加载
     */
    private void mybatisT9() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

    /**
     * 解析器
     */
    private void mybatisT0() {
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();
    }

}
