package com.todos.todos.model.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "patient")
@Data
public class PatientRecord {
    @Id
    @Column(name = "psaid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="fname")
    private String fname;
    @Column(name="lname")
    private String lname;
    @Column(name="addressline1")
    private String addressLine1;
    @Column(name="city")
    private String city;
    @Column(name="pin")
    private String pin;
    @Column(name="contact")
    private String contact;
    @Column(name="patientimage")
    private String patientImage;
    @Column(name="emergencycontact")
    private String emergencyContact;
    @Column(name="guardianfirstname")
    private String guardianFirstName;
    @Column(name="guardianlastname")
    private String guardianLastName;
    @Column(name="guardiancontact")
    private String guardianContact;
    @Column(name="guardianaddress1")
    private String guardianAddress1;
    @Column(name="guardiancity")
    private String guardianCity;
    @Column(name="guardianstate")
    private String guardianState;
    @Column(name="guardianpin")
    private String guardianPin;
    @Column(name="guardianimage")
    private String guardianImage;
}
