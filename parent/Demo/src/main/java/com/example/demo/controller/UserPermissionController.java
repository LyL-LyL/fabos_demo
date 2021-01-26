package com.example.demo.controller;

import com.example.demo.pojo.Permission;
import com.example.demo.pojo.User;
import com.example.demo.service.UserPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-24
 */
@RestController
public class UserPermissionController {

    @Autowired
    private UserPermissionService userPermissionService;

    /**
     * 根据用户id获取权限(用户权限绑定表、权限表)
     */
    @PostMapping("/getRightByUser")
    public List<Permission> getPermissionById() {
        List<Permission> permissionList = userPermissionService.getPermissionById(3);
        return permissionList;
    }

    /**
     * 根据权限id查询拥有该权限的用户
     */
    @PostMapping("/getUserByRight")
    public List<User> getUserByRight() {
        List<User> UserList = userPermissionService.getUserByRight(3);
        return UserList;
    }


}




















