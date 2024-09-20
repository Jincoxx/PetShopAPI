package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "facturas")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfactura")
    private Integer idBill;

    @Column(name = "Nombre del Cliente")
    private String customer;

    @Column(name = "Direccion")
    private String address;

    @Column(name = "Telefono")
    private int phone;

    @Column(name = "Nombre Mascota")
    private String petname;
}
