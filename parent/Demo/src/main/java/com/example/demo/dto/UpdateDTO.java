package com.example.demo.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@Data
public class UpdateDTO {

    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "userpassword")
    private String userpassword;
}
