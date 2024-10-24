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

    // Getters and Setters


    public Integer getIdAppointment() {
        return idAppointment;
    }
    public void setIdAppointment(Integer idAppointment) {
        this.idAppointment = idAppointment;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
