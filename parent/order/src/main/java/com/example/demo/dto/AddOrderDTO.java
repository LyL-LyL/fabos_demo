package com.example.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

/**
 * 订单DTO
 *
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@Data
@Component
public class AddOrderDTO {

    /**
     * 用户id
     */
    @Column(name = "id")
    private int id;



    /**
     * 订单数量
     */
    @Column(name = "quantity")
    private int quantity;


    /**
     * 仓库id
     */
    @Column(name = "storageId")
    private String storageId;





}
