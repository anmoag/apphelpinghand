package com.inserta.apphelpinghand.models;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int idTipo;
    @Column(unique = true)
    private String email;
    private String foto;
    private double latitud;
    private double longitud;
    private String pass;
    private LocalDateTime fechaNacimiento;
    private LocalDateTime usuarioDesde;
    private String token;
    private String sexo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String curso;
    private String direccion;
    private String ciudad;
    private int codigoPostal;
    private String pais;
    private String telefono;
    private boolean logueado;
    @ManyToOne// Establece una relación entre Mensaje y Usuario.
    // Cada mensaje tiene un remitente y un destinatario que son instancias de la clase Usuario.
    @JoinColumn(name = "puntuacion", referencedColumnName = "id")
    private Puntuacion puntuacion;



}
