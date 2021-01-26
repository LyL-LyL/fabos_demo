package com.example.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@Data
@Component
public class AddDTO {

    @Column(name = "username")
    private String username;

    @Column(name = "userpassword")
    private String userpassword;

}
