package com.aydogdu.student.business.impl;

import com.aydogdu.student.business.StudentService;
import com.aydogdu.student.business.dto.StudentDto;
import com.aydogdu.student.data.entity.Student;
import com.aydogdu.student.data.repository.StudentRepository;
import com.aydogdu.student.exception.StudentAlreadyExistException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 6:55 PM
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    ModelMapper modelMapper;


    public List<StudentDto> findAllStudents() {
        return entitytoDtoList(studentRepository.findAll());
    }

    public StudentDto entityToDto(Student student){
        return modelMapper.map(student,StudentDto.class);
    }
    public Student dtoToEntity(StudentDto studentDto){
        return modelMapper.map(studentDto,Student.class);
    }

    public List<StudentDto> entitytoDtoList(List<Student> Students){
        List<StudentDto> StudentDtos = null;
        for (Student Student:Students) {
            StudentDtos.add(entityToDto(Student));
        }
        return StudentDtos;
    }

    public StudentDto saveStudent(StudentDto studentDto) {

        if(studentRepository.findByIdNumber(studentDto.getIdNumber())== null)
        {
            StudentDto savedStudentDto= entityToDto(studentRepository.save(dtoToEntity(studentDto)));
            return savedStudentDto;

        }
       else {

            throw new StudentAlreadyExistException("This Student already exist");
        }
    }
}
