package com.JavaTraining.Controller;

import com.JavaTraining.Entity.Patients;
import com.JavaTraining.services.patientS;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * fighting!!!
 **/
@Controller
public class PatientController {
    public patientS patientS;

    public PatientController(com.JavaTraining.services.patientS patientS) {
        this.patientS = patientS;
    }

    @GetMapping("/patients")
    public String handlerPatient(Model m){
        m.addAttribute("patients",patientS.getPatients());
        return "patients";
    }
}
