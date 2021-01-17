package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "id")
    private Integer id;

    //用户姓名
    @Column(name = "username")
    private String userName;

    //用户密码
    @Column(name = "userPassword")
    private String userpassword;

}
