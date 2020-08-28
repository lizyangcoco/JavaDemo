package com.example.demo.javax0.基础语法.集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合常用方法
 * Created by 李泽阳 on 2020/4/11 20:03
 */
public class Maps {

    public void mapTest() throws Exception {

        Map<String, String> map = new HashMap();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        // 包含key值
        Set<String> setKey = map.keySet();//获取key集合
        setKey.forEach(s -> {
            String value = map.get(s);
            System.out.println(value);
        });

        // 判断是否包含key值
        boolean icCon_k1 = map.containsKey("k1");
        // 判断是否包含value值
        boolean isCon_v1 = map.containsValue("v1");
        // 判断是否为空
        boolean empty = map.isEmpty();


        // 获取集合，返回此映射中包含的映射关系Set视图
        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.forEach(stringStringEntry -> {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
        });


    }
}
