package com.todos.todos.controllers;

import com.todos.todos.model.entities.PatientRecord;
import com.todos.todos.model.request.PatientRequest;
import com.todos.todos.repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;
    @GetMapping("/{id}")
    public PatientRecord getPatient(@PathVariable String id){
        return patientRepository.findById(Integer.parseInt(id)).get();
    }
    @PostMapping
    public PatientRecord create(@RequestBody PatientRequest request)  {
        PatientRecord record = new PatientRecord();
        record.setContact(request.getContact());
        record.setCity(request.getCity());
        record.setFname(request.getFname());
        record.setLname(request.getLname());
        record.setPatientImage(request.getPatientImage());
        record.setAddressLine1(request.getAddressLine1());
        record.setEmergencyContact(request.getEmergencyContact());
        record.setGuardianFirstName(request.getGuardianFirstName());
        record.setGuardianLastName(request.getGuardianLastName());
        record.setGuardianContact(request.getGuardianContact());
        record.setGuardianCity(request.getGuardianCity());
        return patientRepository.save(record);
    }

    @GetMapping
    public List<PatientRecord> findAllPatients() {
        return (List<PatientRecord>) patientRepository.findAll();
    }

}
