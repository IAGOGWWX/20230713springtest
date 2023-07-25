package com.jyl.configuration;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * user.uid=5201314
 * user.uname=yanyan
 *
 * @Configuration
 * 声明这是一个配置类  在spring中可以替代xml文件
 * @ConfigurationProperties(prefix = "user")
 * 声明这是配置文件类  并且声明前缀
 * @PropertySource("")
 * 声明文件对应的地址
 */

@ConfigurationProperties(prefix = "user")
@Data
public class UserConfig {
    private int uid;
    private String uname;
}
