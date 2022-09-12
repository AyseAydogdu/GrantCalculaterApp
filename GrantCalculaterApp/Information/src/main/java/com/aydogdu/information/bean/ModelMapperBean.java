package com.aydogdu.information.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 10:31 PM
 */
@Configuration
public class ModelMapperBean {
    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
