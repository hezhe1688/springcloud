package com.hezhe.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由网关，主要是在用户通过消费者访问提供者的时候，在之间分隔一层，所有请求
 * 先经过网关，可以进行有效拦截，不暴露真正的微服务名称
 */

@SpringBootApplication
@EnableZuulProxy //路由网关
@EnableEurekaClient
public class Zuul_9527_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
