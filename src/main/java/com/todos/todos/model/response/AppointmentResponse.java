package com.todos.todos.model.response;

import lombok.Data;

@Data
public class AppointmentResponse {
    private int appointmentId;
    private String doctorName;
    private String patientName;
    private String date;
    private String time;
}
