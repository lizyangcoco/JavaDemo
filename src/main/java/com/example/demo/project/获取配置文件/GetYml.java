package com.example.demo.project.获取配置文件;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description：
 * @Created by 李泽阳 @on 2020/8/28 17:25
 */
public class GetYml {
    @Autowired
    ServiceProperties serviceProperties;

    @Test
    public void getParams() {
        String address = serviceProperties.getAddress();
        String port = serviceProperties.getPort();
        System.out.println("address:" + address + "port:" + port);
    }

}
