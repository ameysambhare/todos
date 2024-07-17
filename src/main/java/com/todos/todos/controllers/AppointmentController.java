package com.todos.todos.controllers;

import com.todos.todos.model.entities.AppointmentRecord;
import com.todos.todos.model.request.AppointmentRequest;
import com.todos.todos.model.response.AppointmentResponse;
import com.todos.todos.repos.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
@CrossOrigin("*")
public class AppointmentController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping
    public String hello() {
        return "Hello Appointment World";
    }
    @PostMapping
    public AppointmentRecord createAppointment(@RequestBody AppointmentRequest request){
        AppointmentResponse response = new AppointmentResponse();
        AppointmentRecord appointmentRecord = new AppointmentRecord();
        appointmentRecord.setAppointmentDate(request.getDate());
        appointmentRecord.setTiming(request.getTime());
        appointmentRecord.setDoctorName(request.getDoctorName());
        appointmentRecord.setPatientName(request.getPatientName());
        return appointmentRepository.save(appointmentRecord);
    }
    @GetMapping("/{id}")
    public AppointmentRecord retrieveAppointment(@PathVariable Integer id){
        return appointmentRepository.findById(id).get();
    }
}
