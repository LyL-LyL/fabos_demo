package com.example.demo.controller;

import com.example.demo.dto.AddDTO;
import com.example.demo.dto.DeleteDTO;
import com.example.demo.dto.GetDTO;
import com.example.demo.dto.UpdateDTO;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 增加
     * 不能用@RequestParam注解，报400，bad request
     */
    @PostMapping("/addUser")
    public String addUser(@RequestBody AddDTO addDTO) {
        int result = userService.addUser(addDTO);
        return result == 1 ? "增加成功" : "增加失败";
    }

    /**
     * 修改
     */
    @PostMapping("/updateUser")
    public String updateUSer(@RequestBody UpdateDTO updateDTO) {
        int result = userService.updateUser(updateDTO);
        return result == 1 ? "修改成功" : "修改失败";
    }

    /**
     * 查询
     */
    @PostMapping("/selectById")
    public Object selectById(@RequestBody GetDTO getDTO) {
        Object result = userService.selectById(getDTO);
        return result;
    }

    /**
     * 删除
     */
    @PostMapping("/deleteById")
    public String deleteById(@RequestBody DeleteDTO deleteDTO){
        int result = userService.deleteById(deleteDTO);
        return result == 1 ? "删除成功" : "删除失败" ;
    }


}
