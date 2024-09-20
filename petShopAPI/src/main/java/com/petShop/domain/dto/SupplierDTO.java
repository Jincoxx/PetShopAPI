package com.petShop.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SupplierDTO {
    private Integer idSupplier;
    private String name;
    private String address;
    private int phone;
    private String inventory;
}
