package com.example.demo.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}