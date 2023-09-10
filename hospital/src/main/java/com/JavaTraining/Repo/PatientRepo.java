package com.JavaTraining.Repo;

import com.JavaTraining.Entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * fighting!!!
 **/
public interface PatientRepo extends JpaRepository<Patients, Long> {
}
