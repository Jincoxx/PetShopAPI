package com.petShop.persistance.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Proveedores")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProveedor")
    private Integer idSupplier;

    @Column(name = "Nombre Proveedor")
    private String name;

    @Column(name = "Direccion")
    private String address;

    @Column(name = "Telefono")
    private int phone;

    @Column(name = "Inventario")
    private String inventory;
}
