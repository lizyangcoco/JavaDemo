package com.example.demo.javax8.stream;

import com.example.demo.utils.DemoEntity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李泽阳 on 2019/12/27 18:09
 */
public class StreamReListTest {

    @Test
    public void testStreamReList() {
        List<DemoEntity> demoEntityList=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            DemoEntity demoEntity = new DemoEntity();
            demoEntity.setId(i + "id");
            demoEntity.setDeName(i + "name");
            demoEntity.setDeAge(i + "18");
            demoEntity.setDeSex(i + "boy");
            demoEntityList.add(demoEntity);
        }
    }
}