package models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "incidencias")
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @ManyToOne(fetch = FetchType.LAZY) //relación de muchos a uno
    @JoinColumn(name = "usuario_id") //relación entre Incidencia y Usuario
    private Usuario usuario;

    private String estado;

    private String prioridad;

    @Lob
    private String comentarios;
}
