package com.itsqmet.prueba.repositorio;

import com.itsqmet.prueba.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepositorio extends JpaRepository<Cliente,Integer> {
}
