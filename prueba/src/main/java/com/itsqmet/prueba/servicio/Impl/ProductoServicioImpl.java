package com.itsqmet.prueba.servicio.Impl;

import com.itsqmet.prueba.modelo.Producto;
import com.itsqmet.prueba.repositorio.IProductoRepositorio;
import com.itsqmet.prueba.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicioImpl implements IProductoServicio {
    @Autowired
    private IProductoRepositorio productoRepositorio;


    @Override
    public void insertarProducto(Producto producto) {
        productoRepositorio.save(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productoRepositorio.save(producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productoRepositorio.deleteById(id);

    }

    @Override
    public List<Producto> listarProductos() {
        return productoRepositorio.findAll();

    }

    @Override
    public Optional<Producto> listarProducto(int id) {
        return productoRepositorio.findById(id);
    }
}
