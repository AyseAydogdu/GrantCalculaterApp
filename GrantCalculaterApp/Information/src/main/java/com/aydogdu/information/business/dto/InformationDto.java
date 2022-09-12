package com.aydogdu.information.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 8:02 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InformationDto {
    Long id;
    Long idNumber;
    Integer totalMoney;
    Boolean isWorking;
    Float examPoint;
    Boolean isGetGrant;
}
