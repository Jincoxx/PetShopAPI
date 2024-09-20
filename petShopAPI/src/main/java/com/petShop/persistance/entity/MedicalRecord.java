package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Historia Medica")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhistorialmedico")
    private Integer idMedicalRecord;

    @Column(name = "Edad")
    private Integer age;

    @Column(name = "Raza")
    private String race;

    @Column(name = "antecedentes")
    private String background;
}
