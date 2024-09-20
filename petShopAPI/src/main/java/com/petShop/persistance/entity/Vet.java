package com.petShop.persistance.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Veterinarios")
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Nombre Veterinario")
    private String name;

    @Column(name = "Rol")
    private String role;

    @Column(name = "Telefono")
    private int phone;
}
