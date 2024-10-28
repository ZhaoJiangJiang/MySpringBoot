package com.myenable.other.myenableother.config;

import com.myenable.other.myenableother.entity.Shop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfig {
    @Bean
    public Shop shop() {
        return new Shop();
    }
}
