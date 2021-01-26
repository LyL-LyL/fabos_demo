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
@Table(name = "permission")
public class Permission {

    /**
     * 权限表自增主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long permissionId;

    /**
     * 权限名
     */
    @Column(name = "permissionName")
    private String permissionName;


}







