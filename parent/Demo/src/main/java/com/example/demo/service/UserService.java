package com.example.demo.service;

import com.example.demo.dto.AddDTO;
import com.example.demo.dto.DeleteDTO;
import com.example.demo.dto.GetDTO;
import com.example.demo.dto.UpdateDTO;
import com.example.demo.mappers.UserMapper;
import org.springframework.stereotype.Service;
import com.example.demo.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@Transactional
@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;


    /**
     * 增加
     */
    public int addUser(AddDTO addDTO) {
        User user = new User();
        user.setUsername(addDTO.getUsername());
        user.setUserpassword(addDTO.getUserpassword());
        int result = userMapper.insertSelective(user);
        return result;
    }

    /**
     * 修改
     */
    public int updateUser(UpdateDTO updateDTO) {
        User user = userMapper.selectByPrimaryKey(updateDTO.getId());
        user.setUsername("XiaoH");
        user.setUserpassword("111");
        int result = userMapper.updateByPrimaryKeySelective(user);
        return result;
    }

    /**
     * 查询
     */
    public Object selectById(GetDTO getDTO) {
        User user = userMapper.selectByPrimaryKey(getDTO.getId());
        return user;
    }


    /**
     * 删除
     */
    public int deleteById(DeleteDTO deleteDTO) {
        int result = userMapper.deleteByPrimaryKey(deleteDTO.getId());
        return result;
    }


}
