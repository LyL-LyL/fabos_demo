package com.example.demo.mappers;

import com.example.demo.service.StorageService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-18
 */
@Component
@FeignClient(value = "STORAGE", fallback = StorageService.class)  //提供者的应用名(在eureka注册的),程序终止运行后执行fallback
public interface StorageFeignClient {

    /**
     * storage(提供者的映射方法)
     */
    @PostMapping("/addOrder")
    String addOrder(@RequestParam String storageId, @RequestParam Integer quantity);

}
