package com.example.demo.mappers;

import com.example.demo.dto.UpdateDTO;
import com.example.demo.mapper.MyMapper;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 业务的mapper接口类
 *
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@Mapper
@Component
public interface UserMapper extends MyMapper<User> {

    //新增
    public void addUser(User user);

    public int updateUser(UpdateDTO updateDTO);

}
