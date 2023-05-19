package com.example.boot.config;

import com.example.boot.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/5/10 16:59
 */
@Configuration
public class MyConfig {

    @Bean
    public UserService getUserService() {
        return new UserService();
    }
}
