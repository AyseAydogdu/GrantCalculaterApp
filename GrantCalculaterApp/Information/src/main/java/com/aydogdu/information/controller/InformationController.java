package com.aydogdu.information.controller;

import com.aydogdu.information.business.InformationService;
import com.aydogdu.information.business.dto.InformationDto;
import com.aydogdu.information.business.impl.InformationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 7:41 PM
 */
@RestController
@RequiredArgsConstructor
public class InformationController {

    private final InformationServiceImpl informationService;

    @GetMapping("/{idNumber}")
    public ResponseEntity<Boolean> getGrantResult(@PathVariable Long idNumber)
    {
        return ResponseEntity.ok(informationService.getGrantResult(idNumber));
    }
    @PostMapping
    public ResponseEntity<String> saveStudentInformation(@RequestBody InformationDto informationDto)
    {
        return ResponseEntity.ok(informationService.saveStudentInformation(informationDto));
    }
}
