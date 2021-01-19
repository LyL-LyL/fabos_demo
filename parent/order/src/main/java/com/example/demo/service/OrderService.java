package com.example.demo.service;

import com.example.demo.dto.AddOrderDTO;
import com.example.demo.mappers.OrderMapper;
import com.example.demo.mappers.StorageFeignClient;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@Transactional
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StorageFeignClient storageFeignClient;

    /**
     * 生成订单
     * 如果此方法出错就会调用
     */
    public int addOrder(AddOrderDTO addOrderDTO) {

        //订单的主键用UUID生成
        String orderId = UUID.randomUUID().toString().replaceAll("-", "");

        Order order = new Order();
        order.setOrderId(orderId);
        order.setUserId(addOrderDTO.getId());
        //订单数量
        order.setQuantity(addOrderDTO.getQuantity());
        order.setStorageId(addOrderDTO.getStorageId());
        int result = orderMapper.insertSelective(order);
        storageFeignClient.addOrder(addOrderDTO.getStorageId(), addOrderDTO.getQuantity());
        return result;

    }


}




















