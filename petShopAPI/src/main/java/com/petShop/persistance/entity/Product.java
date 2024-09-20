package com.petShop.persistance.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@Table(name = "Productos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private  Integer idProduct;

    @Column(name = "Juguetes")
    private String toys;

    @Column(name = "Comida")
    private String food;

    @Column(name = "Mediccina")
    private String medicine;
}
