package com.hezhe.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 贺哲
 * @2020-02-12 22:06
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableConfigServer
public class SpringApplication_Config_6001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Config_6001.class,args);
    }
}
