package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;


/**
 * @author HUAWEI
 */
@SpringBootApplication
public class DemoApplication {
    private static Logger logger = Logger.getLogger(String.valueOf(DemoApplication.class));

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("========================启动成功==============================");
    }

}
