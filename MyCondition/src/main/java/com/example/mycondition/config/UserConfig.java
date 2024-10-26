package com.example.mycondition.config;

import com.example.mycondition.condition.MyClassCondition1;
import com.example.mycondition.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    @Conditional(MyClassCondition1.class)
    public User user() {
        return new User();
    }
}
