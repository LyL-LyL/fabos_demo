package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-02
 */
@RestController
public class MysqlController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/mysql")
    public List<Map<String, Object>> getDbType() {
        //from后面的是表名，与yml文件数据源url中的作区分
        String sql = "select * from user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            if (entries != null) {
                //使用迭代器遍历每一对键值对
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
                //如果迭代器中还有元素，则返回true。
                while (iterator.hasNext()) {
                    //返回迭代器中的下一个元素
                    Map.Entry<String, Object> entry = (Map.Entry<String, Object>) iterator.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.println(key + ":" + value);
                }
                System.out.println("===============================");
            }
        }
        return list;
    }
}
