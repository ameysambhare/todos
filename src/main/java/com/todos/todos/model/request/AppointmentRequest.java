package com.todos.todos.model.request;

import lombok.Data;

@Data
public class AppointmentRequest {
    private String doctorName;
    private String patientName;
    private String date;
    private String time;
}
