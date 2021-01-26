package com.example.demo.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * 本地通用mapper接口类
 *
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-10
 */

public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
