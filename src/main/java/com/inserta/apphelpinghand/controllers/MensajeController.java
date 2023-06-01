package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.service.MensajeService;
import com.inserta.apphelpinghand.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Usuario enviarMensajeAcosado(@RequestBody Usuario usuarioAcosado) {
        Mensaje mensajeEnviado = mensajeService.enviarMensajeAcosado(usuarioAcosado);
        return null;
    //TODO método en construcción, no usar.
    }
}
