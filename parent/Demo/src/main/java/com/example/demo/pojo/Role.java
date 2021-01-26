package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-23
 */
@Data
@Table(name = "role")
public class Role {

    /**
     * 角色表自增主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private int roleId;


    /**
     * 角色名
     */
    @Column(name = "roleName")
    private String roleName;


}
