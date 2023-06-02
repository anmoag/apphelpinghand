package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.service.UsuarioService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String email,
            @RequestParam String pass,
            @RequestParam(defaultValue = "false") boolean mantener,
            HttpSession session,
            HttpServletResponse response,
            Model model
    ) {
        System.out.println("correo :" + email);
        System.out.println("clave :" + pass);
        Usuario usuario = usuarioService.obtenerPorEmailYClave(email, pass);
        if (usuario != null) {
            // Usuario autenticado correctamente, iniciar sesión
            session.setAttribute("usuario", usuario);

            // Si se seleccionó "Mantener mi sesión", establecer un tiempo de sesión más largo
            if (mantener) {
                // Para que este siempre la sesion activa
                int maxAge = (7 * 24 * 60 * 60); // 7 días en segundos
                Cookie cookie = new Cookie("session", session.getId());
                cookie.setMaxAge(maxAge);
                response.addCookie(cookie);
                //Tiempo determinado
                //session.setMaxInactiveInterval(7 * 24 * 60 * 60);
            }

            return "redirect:/";
        } else {
            // Credenciales incorrectas
            model.addAttribute("error", "Usuario y/o contraseña incorrectas");
            return "/login";
        }
    }
}
