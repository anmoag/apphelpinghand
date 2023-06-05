package com.inserta.apphelpinghand.service;

import com.inserta.apphelpinghand.models.Mensaje;
import com.inserta.apphelpinghand.models.Usuario;
import com.inserta.apphelpinghand.repos.UsuarioRepo;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MensajeServiceImpl implements MensajeService {

    private final UsuarioRepo usuarioRepo;
    private static final double RADIO_DE_LA_TIERRA = 6371; // Radio de la Tierra en kilómetros
    private static final double RANGO_DE_INFLUENCIA = 300;

    public MensajeServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;

    }
    /**
     * Envía un mensaje de ayuda desde un usuario acosado a los usuarios cercanos.
     * @param usuarioAcosado El usuario acosado que envía el mensaje de ayuda.
     * @return El mensaje enviado.
     */
    public Mensaje enviarMensajeAcosado(Usuario usuarioAcosado) {
        // Crear mensaje
        Mensaje mensaje = new Mensaje();
        mensaje.setContenido("Necesito ayuda");
        mensaje.setRemitente(usuarioAcosado);
        mensaje.setFechaEnvio(LocalDateTime.now()); // Dar formato a la fecha y hora
        usuarioAcosado.setFoto("foto1"); // Aquí la url de la foto del usuario
        mensaje.setLeido(false);
        // Enviar mensaje a usuarios cercanos
        for (Usuario usuarioCercano : this.obtenerUsuariosCercanos(usuarioAcosado, RANGO_DE_INFLUENCIA)) {
            mensaje.setDestinatario(usuarioCercano);
        }
        return mensaje;

    }


    /**
     * Obtiene una lista de usuarios cercanos a un usuario acosado, dentro de una distancia específica.
     * Los usuarios cercanos se determinan en función de su distancia geográfica utilizando el método `calcularDistancia`.
     * @param usuarioAcosado El usuario acosado.
     * @param distancia La distancia máxima en la que se considera que un usuario está "cerca" del usuario acosado.
     * @return Una lista de usuarios cercanos al usuario acosado, dentro de la distancia especificada.
     */
    public List<Usuario> obtenerUsuariosCercanos(Usuario usuarioAcosado, double distancia) {
        List<Usuario> todosLosUsuarios = usuarioRepo.findAll();
        System.out.println("todos los usuarios");
        System.out.println("//////////" + todosLosUsuarios);
        List<Usuario>usuariosCercanos = new ArrayList<>();

        for (Usuario usuarioCercano : todosLosUsuarios) {
            if (usuarioCercano.getId() != usuarioAcosado.getId()) { // no incluyo al usuarioAcosado

                double distanciaEntreUsuarios = calcularDistancia(usuarioAcosado, usuarioCercano);
                if (distanciaEntreUsuarios <= distancia) {
                    usuariosCercanos.add(usuarioCercano);
                    System.out.println("----------" + usuarioCercano);
                }
            }
        }
        return usuariosCercanos;
    }

    /**
     * Calcula la distancia en metros entre dos usuarios basándose en sus coordenadas geográficas.
     * Utiliza la fórmula del haversine para el cálculo.
     *
     * @param usuarioAcosado El usuario acosado.
     * @param usuarioCercano El usuario cercano.
     * @return La distancia en metros entre los dos usuarios.
     */
    public double calcularDistancia(Usuario usuarioAcosado, Usuario usuarioCercano) {
        double latitud1Rad = Math.toRadians(usuarioAcosado.getLatitud());
        double latitud2Rad = Math.toRadians(usuarioCercano.getLatitud());
        double deltaLatitud = Math.toRadians(usuarioCercano.getLatitud() - usuarioAcosado.getLatitud());
        double deltaLongitud = Math.toRadians(usuarioCercano.getLongitud() - usuarioAcosado.getLongitud());
        double a = Math.sin(deltaLatitud / 2) * Math.sin(deltaLatitud / 2)
                + Math.cos(latitud1Rad) * Math.cos(latitud2Rad)
                * Math.sin(deltaLongitud / 2) * Math.sin(deltaLongitud / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        // Paso la distancia a metros
        double distanciaEnMetros = RADIO_DE_LA_TIERRA * c * 1000;

        // Redondear la distancia al entero más cercano
        long distanciaRedondeada = Math.round(distanciaEnMetros);

        System.out.println("distancia " + usuarioCercano.getId());
        System.out.println(distanciaRedondeada);
        return distanciaRedondeada;
    }

}

