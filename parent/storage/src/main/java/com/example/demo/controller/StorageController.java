package com.example.demo.controller;

import com.example.demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 增加Order,减少库存
     * 不能用@RequestParam注解，报400，bad request
     */
    @PostMapping("/addOrder")
    public String addOrder(@RequestParam String storageId,@RequestParam Integer quantity){
        int result = storageService.addOrder(storageId,quantity);
        return result == 1 ? "减少库存成功" : "减少库存失败";
    }

    /**
     * 增加库存
     */
    @PostMapping("/addStorage")
    public String addStorage(){
        int result = storageService.addStorage();
        return result == 1 ? "增加库存成功" : "增加库存失败";
    }
}











