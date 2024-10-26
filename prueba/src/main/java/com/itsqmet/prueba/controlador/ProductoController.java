package com.itsqmet.prueba.controlador;

import com.itsqmet.prueba.modelo.Empleado;
import com.itsqmet.prueba.modelo.Producto;
import com.itsqmet.prueba.servicio.IEmpleadoServicio;
import com.itsqmet.prueba.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductoController {
    @Autowired
    IProductoServicio productoServicio;

    @GetMapping("/productos")
    public String listaProductos(Model model){
        List<Producto> productos=productoServicio.listarProductos();
        model.addAttribute("listadoProductos", productos);
        return "producto/listarProducto";
    }
    @GetMapping("/crearProducto")
    public String crearProducto(Model model){
        model.addAttribute("titulo","Crear Producto");
        model.addAttribute("nuevoProducto",new Producto());
        return "producto/crearProducto";
    }
    @PostMapping("/nuevoProductoR")
    public String guardarPrdoucto(@ModelAttribute("nuevoProducto") Producto producto){
        productoServicio.insertarProducto(producto);
        return  "redirect:/productos";

    }

    @GetMapping("editarProducto/{idProducto}")
    public  String editarProducto(@PathVariable int idProducto, Model model){
        Optional<Producto> producto=productoServicio.listarProducto(idProducto);
        model.addAttribute("nuevoProducto", producto );
        model.addAttribute("titulo","Editar Producto");
        return "producto/crearProducto";

    }
    @GetMapping("eliminarProducto/{idProducto}")
    public  String eliminarProducto(@PathVariable int idProducto, Model model){
        productoServicio.eliminarProducto(idProducto);
        return "redirect:/productos";

    }



}
