package com.example.demo.controller;

import com.example.demo.dto.AddOrderDTO;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    /**
     * 增加
     * 不能用@RequestParam注解，报400，bad request
     */
    @PostMapping("/addOrder")
    public String addOrder(@RequestBody AddOrderDTO addOrderDTO){
        int result = orderService.addOrder(addOrderDTO);
        return result == 1 ? "下单成功" : "下单失败";
    }
}


















