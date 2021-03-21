
package com.example.demo.myBatis.开发重点知识;import org.springframework.data.repository.query.Param;
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
     * @param t1 单个参数
     * @return
     */
    List<Object> getListToParams(@Param("t1") String t1);

    /**
     * map参数传递
     *
     * @param paramsMap map参数
     * @return
     */
    List<Object> getListToMap(Map<String, Object> paramsMap);

    /**
     * bean对象参数传递
     *
     * @param paramsBean bean 参数
     * @return
     */
    List<Object> getListToBean(Object paramsBean);

}