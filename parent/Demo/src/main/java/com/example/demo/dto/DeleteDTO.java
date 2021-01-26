package com.example.demo.dto;

import lombok.Data;

import javax.persistence.Column;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */
@Data
public class DeleteDTO {

    @Column(name = "id")
    private Long id;

}
