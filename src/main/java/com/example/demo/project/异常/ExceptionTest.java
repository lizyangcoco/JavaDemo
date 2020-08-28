package com.example.demo.project.异常;

import java.util.Optional;

/**
 * @description：
 * @Created by 李泽阳 @on 2020/8/28 11:36
 */
public class ExceptionTest {

    public static void main(String[] args) {


        Integer der = null;
        Integer s = 1;
        if (!Optional.ofNullable(der).isPresent()) {
            throw new BusinessException(0,"错误");
        }
    }
}
