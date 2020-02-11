package com.hezhe.microservicecloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient //开启eureka客户端,本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@SpringBootApplication
@EnableCircuitBreaker //断路器
@MapperScan("com.hezhe.microservicecloud.mapper")
/**
 * 断路器类似于spring中aop的异常通知，因为微服务都是许多个服务之间相互调用的
 * 如果其中一个出现问题，将会导致服务雪崩，此时添加断路器，就可以预防这种问题，
 * 类似于电路之中的保险丝
 */
public class DeptProvider8001_Config_App_hystrix {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Config_App_hystrix.class, args);
    }

    /**
     * 豪猪访问设置
     * @return
     */
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registration.addUrlMappings("/hystrix.stream");
        return registration;
    }
}
