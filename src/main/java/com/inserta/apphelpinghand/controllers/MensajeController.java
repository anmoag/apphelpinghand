package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.service.MensajeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    private final MensajeService mensajeService;

    public MensajeController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @PostMapping("/enviar")
    public Mensaje enviarMensajeAcosado(@RequestBody Usuario usuarioAcosado) {
                return mensajeService.enviarMensajeAcosado(usuarioAcosado);
    }
}
