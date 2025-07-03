package com.example.hospital.service.impl;

import com.example.hospital.entity.PatientEntity;
import com.example.hospital.repository.PatientRepository;
import com.example.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;
    @Override
    public PatientEntity addPatient(PatientEntity patientEntity) {
        patientEntity.setArrivalTime(LocalDateTime.now());
        return patientRepository.save(patientEntity);
    }

    @Override
    public List<PatientEntity> getAllPatients() {
        return patientRepository.findAllByOrderBySeverityDescArrivalTimeAsc();
    }

    @Override
    public PatientEntity treatNextPatient() {
        List<PatientEntity> patientEntities = getAllPatients();
        if(patientEntities.isEmpty()) return null;
         PatientEntity patientEntity =   patientEntities.get(0);
         patientRepository.deleteById(patientEntity.getId());
        return patientEntities.get(0);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public void clearQueue() {
    patientRepository.deleteAll();
    }
}
