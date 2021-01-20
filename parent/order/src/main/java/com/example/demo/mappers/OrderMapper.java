package com.example.demo.mappers;

import com.example.demo.mapper.MyMapper;
import com.example.demo.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@Mapper
@Component

public interface OrderMapper extends MyMapper<Order> {


}

