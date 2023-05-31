package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.service.MensajeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    private final MensajeService mensajeService;

    public MensajeController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarMensajeAcosado(@RequestBody Usuario usuarioAcosado) {
        Mensaje mensajeEnviado = mensajeService.enviarMensajeAcosado(usuarioAcosado);
        return ResponseEntity.ok("Mensaje enviado correctamente");

    }
}
