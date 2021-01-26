package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-23
 */
@Data
@Table(name = "rolePermission")
public class RolePermission {

    /**
     * 权限id
     */
    @Column(name = "permissionId")
    private int permissionId;


    /**
     * 角色id
     */
    @Column(name = "roleId")
    private int roleId;


}



