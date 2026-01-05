package com.codding.secondproject.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapperconfig {
    @Bean
    ModelMapper modelmapper(){
        return new ModelMapper();
    }
}
