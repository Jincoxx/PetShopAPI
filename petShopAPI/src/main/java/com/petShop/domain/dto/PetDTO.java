package com.petShop.domain.dto;

import lombok.Data;

@Data
public class PetDTO {
    private Integer idPet;
    private String name;
    private String species;
    private int age;
    private String gender;
}
