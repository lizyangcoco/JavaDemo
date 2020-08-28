package com.example.demo.project.获取配置文件;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description：
 * @Created by 李泽阳 @on 2020/8/28 17:22
 */
@Component
@ConfigurationProperties(prefix = "server")
@Data
public class ServiceProperties {
    private String address;
    private String port;
}
