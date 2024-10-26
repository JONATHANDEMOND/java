package com.itsqmet.prueba.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    private String nombre;
    private String apellido;

    @OneToMany (mappedBy = "idCliente",cascade = CascadeType.ALL)
    private List<Pedido> pedidos=new ArrayList<>();

}
