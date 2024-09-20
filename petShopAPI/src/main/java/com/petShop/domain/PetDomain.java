package com.petShop.domain;

import com.petShop.domain.OwnerDomain;
import lombok.Data;

@Data
public class PetDomain {
        private Integer idPet;
        private String name;
        private String species;
        private int age;
        private String gender;
        //private String gendePet;
        private OwnerDomain ownerDomain;
}
