package com.petShop.persistance.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "mascotas")
public class Pet {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Integer idPet;

    @Column(name = "nombre")
    private String name;

    @Column(name = "especie")
    private String species;

     @Column(name = "edad")
    private int age;

     @Column(name = "genero")
    private String gender;
}
