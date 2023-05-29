package com.inserta.apphelpinghand.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString
@Entity
@Table(name = "chat_mensajes")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "remitente_id") //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del remitente. El atributo nullable = false dice que el remitente no puede ser nulo
    private Usuario remitente;
    @ManyToOne
    @JoinColumn(name = "destinatario_id") //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del destinatario. El atributo nullable = false dice que el destinatario no puede ser nulo
    private Usuario destinatario;
    private String contenido;
    private LocalDateTime fechaEnvio;
}
