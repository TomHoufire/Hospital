package com.JavaTraining.services.impl;

import com.JavaTraining.Entity.Patients;
import com.JavaTraining.Repo.PatientRepo;
import com.JavaTraining.services.patientS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * fighting!!!
 **/
@Service
public class PatientImpl implements patientS {
    private final PatientRepo patientRepo;
    @Autowired
    public PatientImpl(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    @Override
    public List<Patients> getPatients() {
        return patientRepo.findAll();
    }
}
