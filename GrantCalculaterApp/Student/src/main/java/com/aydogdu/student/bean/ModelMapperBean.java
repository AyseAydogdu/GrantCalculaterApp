package com.aydogdu.student.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 7:16 PM
 */
@Configuration
public class ModelMapperBean {
    @Bean
    ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
