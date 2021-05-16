
package com.example.demo.myBatis.开发重点知识;

import com.example.demo.dao.model.JsonUser;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * @author by 李泽阳 @on 2021/3/18 11:25
 * @description:
 */
public interface MyBatisMapper {

    /**
     * 单参数传递
     *
     * @param hasDelete 单个参数
     * @return
     */
    List<JsonUser> getListToParams(@Param("hasDelete") Integer hasDelete);

    /**
     * map参数传递
     *
     * @param paramsMap map参数
     * @return
     */
    List<JsonUser> getListToMap(Map<String, Object> paramsMap);

    /**
     * bean对象参数传递
     *
     * @param paramsBean bean 参数
     * @return
     */
    List<JsonUser> getListToBean(Object paramsBean);

    /**
     * 嵌套查询结果
     *
     * @return
     */
    List<JsonUser> getListByOtherSql();


}