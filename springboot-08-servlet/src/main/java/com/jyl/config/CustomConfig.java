package com.jyl.config;

import com.jyl.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * web.xml
 * <filter>
     * <filter-name></filter-name>
     * <filter-class></filter-class>
 * </filter>
 *
 * <filter-mapping>
 *     <filter-name></filter-name>
 *     <url-pattern></filter-url>
 * </filter-mapping>
 *
 */
@Configuration
public class CustomConfig {
    @Bean
    public FilterRegistrationBean<CustomFilter>  getFilterRegistrationBean(){

        FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean<CustomFilter>();
        registrationBean.setFilter(new CustomFilter());
        registrationBean.addUrlPatterns("/*");
//        registrationBean.setOrder(0);////决定注册的优先级
        return registrationBean;

    }
}
