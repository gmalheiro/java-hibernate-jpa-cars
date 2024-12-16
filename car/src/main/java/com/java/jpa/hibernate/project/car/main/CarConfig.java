package com.java.jpa.hibernate.project.car.main;

import com.java.jpa.hibernate.project.car.mapper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
    @Bean
    Mapper mapper () {
        return  new Mapper();
    }
}
