package com.jyl.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBconfig {

    /**
     * @Bean(name="db1")
     * 标明这是一个bean对象
     * @ConfigurationProperties("spring.datasource.db1")
     * 获取到该bean对象需要的参数数据
     * @return
     */
    @Bean(name="db1")
    @ConfigurationProperties("spring.datasource.db1")
    public DataSource db1(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name="db2")
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource db2(){
        return DataSourceBuilder.create().build();
    }

}
