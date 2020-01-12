package com.example.demo.Javax0基础.JavaX设计模型.策略设计模型.Common;

import com.example.demo.Javax0基础.JavaX设计模型.策略设计模型.Algorithm.DefaultStrategy;
import com.example.demo.Javax0基础.JavaX设计模型.策略设计模型.SelectStrategy;

import java.util.Optional;

/**
 * 策略模式：方法调用
 *
 * @author 李泽阳 on 2020/1/10 14:53
 */
public class CommonStrategy {
    //选择策略接口
    private SelectStrategy selectStrategy;

    //设置选择策略
    public void setSelectStrategy(SelectStrategy selectStrategy) {
        this.selectStrategy = selectStrategy;
    }

    //选择算法方式
    public void selectAlgorithm() throws Exception {
        Optional.ofNullable(selectStrategy).orElse(new DefaultStrategy()).selectAlgorithm();
    }


}
