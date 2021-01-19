package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@SpringBootApplication
@EnableEurekaClient   //开启eureka客户端
@EnableFeignClients   //开启feign的功能
@EnableCircuitBreaker //开启熔断器保护功能
//整合通用mapper需要该注解扫描继承了通用mapper的类所在的包
//只能扫描业务的mapper所在的包，不能扫描本地通用mapper所在的包，否则会报错。
@MapperScan("com.example.demo.mappers")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
