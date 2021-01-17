package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@Data
@Table(name = "order1")
public class Order {

    @Id
    @Column(name = "orderId")
    private String orderId;

    /**
     * 用户名
     */
    @Column(name = "userId")
    private Integer userId;

    /**
     * 订单数量
     */
    @Column(name = "quantity")
    private Integer quantity;

    /**
     * 仓库Id
     */
    @Column(name = "storageId")
    private String storageId;


}
