package com.abhishek.config;

import com.abhishek.service.CacheService;
import com.abhishek.service.SimpleCacheService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    CacheService getCacheService(){
        return new SimpleCacheService();
    }
}
