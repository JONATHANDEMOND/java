package com.itsqmet.prueba.repositorio;

import com.itsqmet.prueba.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {
}
