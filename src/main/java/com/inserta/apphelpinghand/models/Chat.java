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
    @JoinColumn(name = "id_remitente", referencedColumnName = "id") //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del remitente.
    private Usuario remitente;
    @ManyToOne
    @JoinColumn(name = "id_destinatario", referencedColumnName = "id") //Especifica la columna en la tabla mensajes que se utiliza
    // para almacenar la clave externa del destinatario.
    private Usuario destinatario;
    private String contenido;
    private LocalDateTime fechaEnvio;
}
