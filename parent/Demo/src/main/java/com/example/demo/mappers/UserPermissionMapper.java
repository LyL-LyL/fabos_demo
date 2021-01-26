package com.example.demo.mappers;

import com.example.demo.mapper.MyMapper;
import com.example.demo.pojo.Permission;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-24
 */
@Mapper
@Component
public interface UserPermissionMapper extends MyMapper<UserPermission> {

    /**
     * 根据用户id获取权限
     */
    List<Permission> getPermissionById(int id);

    /**
     * 根据权限id查询拥有该权限的用户
     */
    List<User> getUserByRight(int permissionId);


}
















