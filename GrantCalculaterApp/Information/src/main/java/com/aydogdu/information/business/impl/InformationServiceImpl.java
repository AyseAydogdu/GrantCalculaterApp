package com.aydogdu.information.business.impl;

import com.aydogdu.information.bean.ModelMapperBean;
import com.aydogdu.information.business.InformationService;
import com.aydogdu.information.business.dto.InformationDto;
import com.aydogdu.information.data.entity.Information;
import com.aydogdu.information.data.repository.InformationRepository;
import com.aydogdu.information.util.CalculateGrantResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 8:01 PM
 */
@Service
@RequiredArgsConstructor
@Transactional
@Log4j2
public class InformationServiceImpl implements InformationService {

    private final InformationRepository informationRepository;

    public Boolean getGrantResult(Long idNumber) {
        return informationRepository.findByIdNumber(idNumber).getIsGetGrant();
    }

    @Autowired
    ModelMapper modelMapper;

    public InformationDto entityToDto(Information student){
        return modelMapper.map(student,InformationDto.class);
    }
    public Information dtoToEntity(InformationDto studentDto){
        return modelMapper.map(studentDto,Information.class);
    }
    public void createGrantResult(InformationDto informationDto) {

        try {
            Boolean result = CalculateGrantResult.generateGrantResult(informationDto);
            if (informationRepository.findByIdNumber(informationDto.getIdNumber()) != null) {
                informationDto.setIsGetGrant(result);
                informationRepository.save(dtoToEntity(informationDto));

            }
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }


    }

    public String saveStudentInformation(InformationDto informationDto) {
        try{
            informationRepository.save(dtoToEntity(informationDto));
            createGrantResult(informationDto);
            return "Student succesfully saved";
        }
        catch (Exception e){
            log.error(e.getMessage());
            return e.getMessage();
        }


    }
}