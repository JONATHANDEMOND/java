package com.itsqmet.prueba.servicio;

import com.itsqmet.prueba.modelo.Empleado;
import com.itsqmet.prueba.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoServicio {

    public void insertarEmpleado(Empleado empleado);

    public void actualizarEmpleado(Empleado empleado);

    public void eliminarEmpleado(int id);

    public List<Empleado> listarEmpleados();

    public Optional<Empleado> listarEmpleado(int id);
}
