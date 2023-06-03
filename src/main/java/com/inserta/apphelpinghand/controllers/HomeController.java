package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(
            @SessionAttribute(required = false) Usuario usuario
    ){
        if (usuario == null) {
            // No hay una sesión activa, redirigir al inicio de sesión
            return "/vistas/login";
        } else {
            // Hay una sesión activa, mostrar el contenido del home
            return "/vistas/index";
        }
    }
}
