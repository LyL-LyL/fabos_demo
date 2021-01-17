package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "storage")
public class Storage {

    /**
     * 仓库主键——UUID生成
     */
    @Id
    @Column(name = "storageId")
    private String storageId;

    /**
     * 仓库名称
     */
    @Column(name = "stuffName")
    private String stuffName;

    /**
     * 仓库名称
     */
    @Column(name = "storageQuantity")
    private Integer storageQuantity;


}




