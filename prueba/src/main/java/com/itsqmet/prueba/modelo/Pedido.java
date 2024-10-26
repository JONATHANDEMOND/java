package com.itsqmet.prueba.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private Cliente idCliente;
    @ManyToOne
    @JoinColumn (name = "id_producto")
    private Producto idProducto;
    private int cantidad;


}
