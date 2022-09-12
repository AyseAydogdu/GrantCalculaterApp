package com.aydogdu.information.util;

import com.aydogdu.information.business.dto.InformationDto;
import org.springframework.stereotype.Component;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 9:54 PM
 */
@Component
public class CalculateGrantResult {
    public static Boolean generateGrantResult(InformationDto informationDto) {
        if(!informationDto.getIsWorking() && informationDto.getExamPoint()>400 && informationDto.getTotalMoney()<5000){
            return true;
        }
        else {
            return false;
        }
    }
}
