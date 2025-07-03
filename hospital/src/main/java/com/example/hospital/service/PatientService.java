package com.example.hospital.service;

import com.example.hospital.entity.PatientEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientService {
    PatientEntity addPatient(PatientEntity patientEntity);
    List<PatientEntity> getAllPatients();
    PatientEntity treatNextPatient();
    void deletePatient(Long id);
    void clearQueue();

}
