package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Druid配置类
 *
 * @Author: liuyl@cecjiutian.com
 * @DATE: 2021-01-17
 */
@Configuration
public class DruidConfig {

    //加载yml文件中的DataSource数据源
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }


    //配置druid管理界面
    @Bean
    public ServletRegistrationBean startViewServlet() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //添加初始化数据
        Map<String, String> initMap = new HashMap<>();
        //账号、密码
        initMap.put("loginUsername", "admin");
        initMap.put("loginPassword", "123456");
        //允许访问所有内容
        initMap.put("allow", "");
        bean.setInitParameters(initMap);
        return bean;
    }

    //设置过滤
    public FilterRegistrationBean startFilter() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());
        Map<String, String> filterMap = new HashMap<>();
        //设置哪些不被拦截
        filterMap.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(filterMap);
        ArrayList<String> list = new ArrayList<>();
        list.add("/*");
        bean.setUrlPatterns(list);
        return bean;
    }


}














