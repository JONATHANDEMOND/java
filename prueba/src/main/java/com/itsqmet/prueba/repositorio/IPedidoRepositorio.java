package com.itsqmet.prueba.repositorio;

import com.itsqmet.prueba.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepositorio extends JpaRepository<Pedido,Integer> {
}
