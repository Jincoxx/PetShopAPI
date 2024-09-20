package com.petShop.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AppointmentDTO {
    private Integer idAppointment;
    private String name;
    private String date;
    private int phone;
    private String address;
}
