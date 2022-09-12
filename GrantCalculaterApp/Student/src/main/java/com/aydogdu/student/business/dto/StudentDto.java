package com.aydogdu.student.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 6:47 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentDto {

    Long id;
    Long idNumber;
    String name;
    Integer age;
}
