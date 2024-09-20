package com.petShop.persistance.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cita")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcita")
    private Integer idAppointment;

    @Column(name = "nombre de la mascota")
    private String name;

    @Column(name = "Fecha")
    private String date;

    @Column(name = "Telefono")
    private int phone;

    @Column(name = "Direccion")
    private String address;

}
