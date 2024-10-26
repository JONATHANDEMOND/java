package com.itsqmet.prueba.repositorio;

import com.itsqmet.prueba.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepositorio extends JpaRepository<Empleado,Integer> {
}
