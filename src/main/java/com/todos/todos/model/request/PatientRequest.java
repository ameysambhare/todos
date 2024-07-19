package com.todos.todos.model.request;

import lombok.Data;

import javax.persistence.Column;

@Data
public class PatientRequest {

    private String fname;

    private String lname;

    private String addressLine1;

    private String city;

    private String pin;

    private String contact;

    private String patientImage;

    private String emergencyContact;

    private String guardianFirstName;

    private String guardianLastName;

    private String guardianContact;

    private String guardianAddress1;

    private String guardianCity;

    private String guardianState;

    private String guardianPin;

    private String guardianImage;
}
