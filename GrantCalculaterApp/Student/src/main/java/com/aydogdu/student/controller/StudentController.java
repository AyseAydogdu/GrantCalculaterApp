package com.aydogdu.student.controller;

import com.aydogdu.student.business.dto.StudentDto;
import com.aydogdu.student.business.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 6:46 PM
 */
@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentServiceImpl studentService;
    @GetMapping
    public ResponseEntity<List<StudentDto>> findAllStudents(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    // https://locallhost:8083
    @PostMapping
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto)
    {
        return ResponseEntity.ok(studentService.saveStudent(studentDto));
    }

}
