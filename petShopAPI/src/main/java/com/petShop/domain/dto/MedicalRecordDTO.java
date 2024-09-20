package com.petShop.domain.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class MedicalRecordDTO {
    private Integer idMedicalRecord;
    private Integer age;
    private String race;
    private String background;
}
