package com.myenable.other.myenableother.config;

import com.myenable.other.myenableother.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public Product product() {
        return new Product();
    }
}
