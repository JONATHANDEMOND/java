package com.itsqmet.prueba.servicio;

import com.itsqmet.prueba.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoServicio {

    public void insertarProducto(Producto producto);

    public void actualizarProducto(Producto producto);

    public void eliminarProducto(int id);

    public List<Producto> listarProductos();

    public Optional<Producto> listarProducto(int id);


}
