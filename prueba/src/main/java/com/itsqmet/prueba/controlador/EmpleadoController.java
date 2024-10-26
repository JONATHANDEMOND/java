package com.itsqmet.prueba.controlador;

import com.itsqmet.prueba.modelo.Empleado;
import com.itsqmet.prueba.servicio.IEmpleadoServicio;
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
public class EmpleadoController  {
    @Autowired
    IEmpleadoServicio empleadoServicio;

    @GetMapping("/empleados")
    public String listaEmpleados(Model model){
        List<Empleado> empleados=empleadoServicio.listarEmpleados();
        model.addAttribute("listadoEmpleados", empleados);
        return "empleado/listarEmpleado";
    }
    @GetMapping("/crearEmpleado")
    public String crearEmpelado(Model model){
        model.addAttribute("titulo","Crear Empleado");
        model.addAttribute("nuevoEmpleado",new Empleado());
        return "empleado/crearEmpleado";
    }
    @PostMapping("/nuevoEmpleadoR")
    public String guardarEmpleado(@ModelAttribute("nuevoEmpleado") Empleado empleado){
        empleadoServicio.insertarEmpleado(empleado);
        return  "redirect:/empleados";

    }

    @GetMapping("editarEmpleado/{idEmpleado}")
    public  String editarEmpleado(@PathVariable int idEmpleado, Model model){
        Optional<Empleado> empleado=empleadoServicio.listarEmpleado(idEmpleado);
        model.addAttribute("nuevoEmpleado", empleado );
        model.addAttribute("titulo","Editar Empleado");
        return "empleado/crearEmpleado";

    }
    @GetMapping("eliminarEmpleado/{idEmpleado}")
    public  String eliminarEmpleado(@PathVariable int idEmpleado, Model model){
       empleadoServicio.eliminarEmpleado(idEmpleado);
        return "redirect:/empleados";

    }



}
