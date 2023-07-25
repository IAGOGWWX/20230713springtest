package com.jyl;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan("com.jyl.mapper")
//@MapperScan("com.jyl.mybatis.mapper")
public class SpringBootMyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatisApplication.class);
    }
}
