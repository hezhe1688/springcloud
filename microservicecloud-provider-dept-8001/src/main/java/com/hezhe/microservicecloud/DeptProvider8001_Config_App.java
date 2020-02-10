package com.hezhe.microservicecloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //开启eureka客户端,本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@SpringBootApplication
@MapperScan("com.hezhe.microservicecloud.mapper")
public class DeptProvider8001_Config_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Config_App.class, args);
    }
}
