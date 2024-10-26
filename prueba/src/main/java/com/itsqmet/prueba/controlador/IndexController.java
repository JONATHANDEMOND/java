package com.itsqmet.prueba.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/inicio", "/"})
public class IndexController {
    @GetMapping
    public String paginaInicio(){
        return "index";
    }
}
