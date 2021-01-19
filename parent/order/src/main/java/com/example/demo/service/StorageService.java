package com.example.demo.service;

import com.example.demo.dto.AddOrderDTO;
import com.example.demo.mappers.StorageFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断开启后的回调
 *
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-18
 */
@Component
public class StorageService implements StorageFeignClient {

    @Override
    public String addOrder(@RequestParam String storageId, @RequestParam Integer quantity) {

        return "Storange模块调用失败";
    }
}
