package com.petShop.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class VetDTO {
    private String name;
    private String role;
    private int phone;
}
