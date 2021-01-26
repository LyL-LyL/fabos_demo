package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-23
 */
@Data
@Table(name = "userRole")
public class UserRole {

    /**
     * 用户id
     */
    @Column(name = "id")
    private Long id;

    /**
     * 角色id
     */
    @Column(name = "roleId")
    private int roleId;


}










