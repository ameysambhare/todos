package com.todos.todos.model.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "appointment")
@Data
public class AppointmentRecord {
    @Id
    @Column(name = "appointment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name="patient_name")
    private String patientName;
    @Column(name="appointment_date")
    private String appointmentDate;
    @Column(name="time")
    private String timing;
}
