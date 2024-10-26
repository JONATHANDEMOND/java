package com.itsqmet.prueba.servicio.Impl;

import com.itsqmet.prueba.modelo.Empleado;
import com.itsqmet.prueba.repositorio.IEmpleadoRepositorio;
import com.itsqmet.prueba.servicio.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpleadoServicioImpl implements IEmpleadoServicio {
    @Autowired
   private IEmpleadoRepositorio empleadoRepositorio;

    @Override
    public void insertarEmpleado(Empleado empleado) {
        empleadoRepositorio.save(empleado);
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(int id) {
        empleadoRepositorio.deleteById(id);

    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Optional<Empleado> listarEmpleado(int id) {
        return empleadoRepositorio.findById(id);
    }
}
