package com.petShop.persistance.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpropietario")
    private Integer idOwnwer;

    @Column(name = "apellidos del propietario")
    private String lastname;

    @Column(name = "correo electronico")
    private String email;

    @Column(name = "direccion ")
    private String address;

    @Column(name = "telefono")
    private String phone;
}
