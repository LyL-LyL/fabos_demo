package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-23
 */
@Data
@Table(name = "userPermission")
public class UserPermission {

    /**
     * 用户id
     */
    @Column(name = "id")
    private Long id;

    /**
     * 权限id
     */
    @Column(name = "permissionId")
    private int permissionId;

}
