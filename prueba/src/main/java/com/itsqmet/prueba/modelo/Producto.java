package com.itsqmet.prueba.modelo;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.util.QTypeContributor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;

    @OneToMany (mappedBy = "idProducto",cascade = CascadeType.ALL)
    private List<Pedido> pedidos=new ArrayList<>();

}
