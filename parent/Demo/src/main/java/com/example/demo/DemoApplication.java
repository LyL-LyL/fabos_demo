package com.example.demo;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ServletComponentScan
//整合通用mapper需要该注解扫描继承了通用mapper的类所在的包
//只能扫描业务的mapper所在的包，不能扫描本地通用mapper所在的包，否则会报错。
@MapperScan("com.example.demo.mappers")
//@ComponentScan(basePackages = {"com.example.demo"})//×
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
