package com.petShop.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductDTO {
    private  Integer idProduct;
    private String toys;
    private String food;
    private String medicine;
}
