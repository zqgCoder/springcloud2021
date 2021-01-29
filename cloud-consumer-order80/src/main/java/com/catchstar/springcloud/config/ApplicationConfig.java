package com.catchstar.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 34114
 * @date: 2021/1/28 17:47
 * @description: 配置类，用于访问支付类
 */
@Configuration
public class ApplicationConfig {
    // application.xml <bean id="" class="”>
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
