package com.example.demo.service;

import com.example.demo.dto.AddOrderDTO;
import com.example.demo.mappers.OrderMapper;
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

    public int addOrder(AddOrderDTO addOrderDTO) {

        //订单的主键用UUID生成
        String orderId = UUID.randomUUID().toString().replaceAll("-", "");
        Order order = new Order();

        order.setOrderId(orderId);
        order.setUserId(3);
        //订单数量
        order.setQuantity(addOrderDTO.getQuantity());
        order.setStorageId(addOrderDTO.getStorageId());
        int result = orderMapper.insertSelective(order);
        return result;

    }


}




















