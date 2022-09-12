package com.aydogdu.information.data.repository;

import com.aydogdu.information.data.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 7:53 PM
 */
@Repository
public interface InformationRepository extends JpaRepository<Information,Long> {
    Information findByIdNumber(Long idNumber);
}
