package com.petShop.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BillDTO {
    private Integer idBill;
    private String customer;
    private String address;
    private int phone;
    private String petname;
}
