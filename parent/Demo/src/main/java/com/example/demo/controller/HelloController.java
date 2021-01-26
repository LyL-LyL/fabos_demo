package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-03
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("SpringBoot的第一个Web controller");
        return "index";
    }
}
