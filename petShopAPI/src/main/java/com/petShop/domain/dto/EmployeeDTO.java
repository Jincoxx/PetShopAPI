package com.petShop.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class EmployeeDTO {
    private int id;
    private String name;
    private String lastname;
    private String post;
}
