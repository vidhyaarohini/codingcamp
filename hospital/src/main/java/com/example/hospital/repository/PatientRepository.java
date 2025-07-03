package com.example.hospital.repository;

import com.example.hospital.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
    List<PatientEntity> findAllByOrderBySeverityDescArrivalTimeAsc();
}
