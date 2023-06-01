package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.service.MensajeService;
import com.inserta.apphelpinghand.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    private final MensajeService mensajeService;
    private final UsuarioService usuarioService;

    public MensajeController(MensajeService mensajeService, UsuarioService usuarioService) {
        this.mensajeService = mensajeService;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/enviar")
    public Mensaje enviarMensajeAcosado(@RequestBody Usuario usuarioAcosado) {
        return mensajeService.enviarMensajeAcosado(usuarioAcosado);
    //TODO método en construcción, no usar.
    }
}
