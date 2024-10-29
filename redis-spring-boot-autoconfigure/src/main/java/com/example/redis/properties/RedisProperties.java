package com.example.redis.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "my-redis")
public class RedisProperties {
    private String host = "localhost";
    private int port = 6379;
}
