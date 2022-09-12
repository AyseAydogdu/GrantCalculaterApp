package com.aydogdu.student.data.repository;

import com.aydogdu.student.business.dto.StudentDto;
import com.aydogdu.student.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.stereotype.Repository;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 6:41 PM
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    StudentDto findByIdNumber(Long idNumber);
}
