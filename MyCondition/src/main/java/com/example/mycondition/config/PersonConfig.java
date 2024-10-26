package com.example.mycondition.config;

import com.example.mycondition.annotation.MyConditionalOnClass;
import com.example.mycondition.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
    @Bean
    @MyConditionalOnClass({"redis.clients.jedis.Jedis","org.springframework.context.annotation.Bean"})
    public Person person() {
        return new Person();
    }
}
