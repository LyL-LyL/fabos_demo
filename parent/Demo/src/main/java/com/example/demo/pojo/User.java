package com.example.demo.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String username;

    private String userpassword;

}
