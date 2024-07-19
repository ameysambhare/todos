package com.todos.todos.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import javax.persistence.Column;

@Data
public class PatientRequest {

    private String fname;

    private String lname;
    @JsonProperty("addressline1")
    private String addressLine1;

    private String city;
    @JsonProperty("pin")
    private String pin;

    private String contact;
    @JsonProperty("patientimage")
    private String patientImage;
    @JsonProperty("emergencycontact")
    private String emergencyContact;
    @JsonProperty("guardianfirstname")
    private String guardianFirstName;
    @JsonProperty("guardianlastname")
    private String guardianLastName;
    @JsonProperty("guardiancontact")
    private String guardianContact;
    @JsonProperty("guardianAddress1")
    private String guardianAddress1;
    @JsonProperty("guardianCity")
    private String guardianCity;

    private String guardianState;

    private String guardianPin;

    private String guardianImage;
}
