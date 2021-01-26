package com.example.demo.service;

import com.example.demo.mappers.UserPermissionMapper;
import com.example.demo.pojo.Permission;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-24
 */
@Transactional
@Service
public class UserPermissionService {


    @Autowired
    private UserPermissionMapper userPermissionMapper;


    /**
     * 根据用户id获取权限(用户权限绑定表、权限表)
     */
    public List<Permission> getPermissionById(int id) {
        List<Permission> permissionList = userPermissionMapper.getPermissionById(id);
        return permissionList;
    }

    /**
     * 根据权限id查询拥有该权限的用户
     */
    public List<User> getUserByRight(int permissionId){
        List<User> UserList = userPermissionMapper.getUserByRight(permissionId);
        return UserList;
    }


}
