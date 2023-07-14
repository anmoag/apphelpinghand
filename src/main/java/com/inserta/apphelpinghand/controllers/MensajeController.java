package com.inserta.apphelpinghand.controllers;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.UsuarioRepo;
import com.inserta.apphelpinghand.service.MensajeService;
import com.inserta.apphelpinghand.service.MensajeServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    private final MensajeService mensajeService;
    private final MensajeServiceImpl mensajeServiceImp;
    private final UsuarioRepo usuarioRepo;

    public MensajeController(MensajeService mensajeService, MensajeServiceImpl mensajeServiceImp, UsuarioRepo usuarioRepo) {
        this.mensajeService = mensajeService;
        this.mensajeServiceImp = mensajeServiceImp;
        this.usuarioRepo = usuarioRepo;
    }

    @PostMapping("/enviar")
    public Mensaje enviarMensajeAcosado(@RequestBody Usuario usuarioAcosado) {
        return mensajeService.enviarMensajeAcosado(usuarioAcosado);
    }

    @GetMapping("/{usuarioAcosadoId}/usuarios-cercanos")
    public List<Usuario> obtenerUsuariosCercanos(@PathVariable("usuarioAcosadoId") Long usuarioAcosadoId) {
        Usuario usuarioAcosado = usuarioRepo.findById(usuarioAcosadoId).orElse(null);
        if (usuarioAcosado != null) {
            return mensajeService.obtenerUsuariosCercanos(usuarioAcosado, mensajeServiceImp.getRangoDeInfluencia());
        }
        //En el caso de no haber usuarios cercanos, se devuelve Collections.emptyList(), que es una lista vacía.
        //En el frontend, al recibir una respuesta vacía, puedes manejarla adecuadamente
        // y mostrar un mensaje apropiado al usuario indicando que no se encontraron usuarios cercanos.
            return Collections.emptyList();
    }
}

