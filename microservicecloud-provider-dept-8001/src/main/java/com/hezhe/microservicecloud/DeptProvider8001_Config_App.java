package com.hezhe.microservicecloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hezhe.microservicecloud.mapper")
/*@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现*/
public class DeptProvider8001_Config_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Config_App.class, args);
    }
}