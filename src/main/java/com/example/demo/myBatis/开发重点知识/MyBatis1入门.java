package com.example.demo.myBatis.开发重点知识;

import com.example.demo.annotation.Annotation;
import com.example.demo.dao.model.JsonUser;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author by 李泽阳 @on 2021/3/6 20:14
 * @description:
 */
public class MyBatis1入门 {
    @Autowired
    private MyBatisMapper myBatisMapper;

    /**
     * 1、ORM框架是什么？持久层框架
     * 2、mybatis的三种传参形式
     * 3、sql元素 简写，sql参数
     * 4、#和${} 区别：#会进行预编译，''两个冒号
     * 5、动态sql元素 if chose when otherwise Trim where set foreach<循环标签>
     * 6、批量操作，foreach 和jdbc的 batch，指定执行器的编译类型为 batch 1、自己提交事务，2、修改执行器bash
     * 7、基于数据库生成mapper接口，实体bean，mybatis generator
     * 8、mybatis generator快速生成代码，的三种方法
     * 9、关联查询，1、三个表禁止join，被关联字段一定要有索引，解决办法1、字段冗余（高频字段）2、多次查询，3、热点数据放到缓存，2、禁止使用外键，进行级联更新，容易造成数据更新风暴
     * 0、嵌套结果（两个表的结果在一起），嵌套查询（多次查询）
     * 0、resultMap转为自定义的pojo 和 resultType转为现有的pojo
     */
    private void moreParams() {
        // 第一种map::禁止使用
        Map<String, Object> paramsMap = new HashMap<>(0);
        paramsMap.put("email", 1);
        paramsMap.put("phone", 1);
        myBatisMapper.getListToMap(paramsMap);
        // 第二种注解多参数
        myBatisMapper.getListToParams(1);
        // 第三种bean对象
        myBatisMapper.getListToBean(new Object());


        // 0、嵌套查询，嵌套查询（多次查询）
        List<JsonUser> listByOtherSql = myBatisMapper.getListByOtherSql();

    }

    /**
     * bash 的批量操作
     */
    private void bash() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册一个数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 获得一个连接
            conn = DriverManager.getConnection("url", "user", "password");
            // 关闭自动提交
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            // 创建一次插入
            String sql1 = "insert into json_user xxx";
            String sql2 = "select id,name code";
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            int[] executeBatch = stmt.executeBatch();
            // 手动提交数据
            conn.commit();
            // 关闭连接
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}