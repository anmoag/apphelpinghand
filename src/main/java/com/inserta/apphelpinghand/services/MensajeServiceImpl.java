package com.inserta.apphelpinghand.services;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.MensajeRepo;
import com.inserta.apphelpinghand.repos.UsuarioRepo;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MensajeServiceImpl implements MensajeService {
    private final MensajeRepo mensajeRepo;
    private final UsuarioRepo usuarioRepo;
    private static final double RADIO_DE_LA_TIERRA = 6371; // Radio de la Tierra en kilómetros
    private static final double RANGO_DE_INFLUENCIA = 300;

    public MensajeServiceImpl(MensajeRepo messageRepo, UsuarioRepo usuarioRepo) {
        this.mensajeRepo = messageRepo;
        this.usuarioRepo = usuarioRepo;

    }

    public Mensaje enviarMensajeAcosado(Usuario usuarioAcosado) {

        // Crear mensaje
        Mensaje mensaje = new Mensaje();
        mensaje.setContenido("Necesito ayuda");
        mensaje.setRemitente(usuarioAcosado);
        mensaje.setFechaEnvio(LocalDateTime.now()); // Dar formato a la fecha y hora
        usuarioAcosado.setFoto(""); // Aquí la url de la foto del usuario
        mensaje.setLeido(false);

        // Enviar mensaje a usuarios cercanos
        for (Usuario usuario : this.obtenerUsuariosCercanos(usuarioAcosado, RANGO_DE_INFLUENCIA)) {
            mensaje.setDestinatario(usuario);
            mensajeRepo.save(mensaje);
        }
        return mensaje;

    }

    //Método que proviene de stack overflow para calcular la distancia entre dos Usuarios
    public double calcularDistancia(Usuario usuarioAcosado, Usuario usuarioCercano) {
        double latitud1Rad = Math.toRadians(usuarioAcosado.getLatitud());
        double latitud2Rad = Math.toRadians(usuarioCercano.getLatitud());
        double deltaLatitud = Math.toRadians(usuarioCercano.getLatitud() - usuarioAcosado.getLatitud());
        double deltaLongitud = Math.toRadians(usuarioCercano.getLongitud() - usuarioAcosado.getLatitud());

        double a = Math.sin(deltaLatitud / 2) * Math.sin(deltaLatitud / 2)
                + Math.cos(latitud1Rad) * Math.cos(latitud2Rad)
                * Math.sin(deltaLongitud / 2) * Math.sin(deltaLongitud / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distanciaEnMetros;
        // Convertir la distancia a metros
        distanciaEnMetros = RADIO_DE_LA_TIERRA * c * 1000;

        return distanciaEnMetros;
    }

    public List<Usuario> obtenerUsuariosCercanos(Usuario usuarioAcosado, double distancia) {
        List<Usuario> todosLosUsuarios = usuarioRepo.findAll();
        List<Usuario>usuariosCercanos = new ArrayList<>();

        for (Usuario usuario : todosLosUsuarios) {
            if (usuario.getId() != usuarioAcosado.getId()) { // no incluyo al usuarioAcosado
                double distanciaEntreUsuarios = calcularDistancia(usuarioAcosado, usuario);
                if (distanciaEntreUsuarios <= distancia) {
                    usuariosCercanos.add(usuario);
                }
            }
        }

        return usuariosCercanos;
    }
}

