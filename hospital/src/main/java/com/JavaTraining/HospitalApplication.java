package com.JavaTraining;

import com.JavaTraining.Entity.Patients;
import com.JavaTraining.Repo.PatientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(HospitalApplication.class, args);
	}
	private final PatientRepo patientRepo;

	public HospitalApplication(PatientRepo patientRepo) {
		this.patientRepo = patientRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Patients patients = new Patients("Jack","Kung","Male","12345@gamil.com");
		patientRepo.save(patients);
	}
}
