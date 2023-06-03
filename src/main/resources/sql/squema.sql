
-- Borrar la base de datos si existe
DROP DATABASE IF EXISTS appHelping;

-- Crear la base de datos
CREATE DATABASE appHelping;

-- Usar la base de datos
USE appHelping;

-- Crear tabla usuarios
CREATE TABLE usuarios (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT, -- El rango de valores posibles para un BIGINT generalmente
    -- va desde -9223372036854775808 hasta 9223372036854775807.
                          id_tipo INT NOT NULL,
                          email VARCHAR(255) NOT NULL UNIQUE,
                          foto VARCHAR(255),
                          latitud DOUBLE NOT NULL,
                          longitud DOUBLE NOT NULL,
                          pass VARCHAR(255) NOT NULL,
                          fecha_nacimiento DATETIME,
                          usuario_desde DATETIME NOT NULL,
                          token VARCHAR(255),
                          sexo VARCHAR(255),
                          nombre VARCHAR(255) NOT NULL,
                          apellido1 VARCHAR(255),
                          apellido2 VARCHAR(255),
                          curso VARCHAR(255),
                          direccion VARCHAR(255) NOT NULL,
                          ciudad VARCHAR(255) NOT NULL,
                          codigo_postal INT NOT NULL,
                          pais VARCHAR(255) NOT NULL,
                          telefono VARCHAR(255),
                          logueado BOOLEAN
);

-- Crear tabla mensajes
CREATE TABLE mensajes (
                          id BIGINT PRIMARY KEY AUTO_INCREMENT,
                          contenido VARCHAR(255) NOT NULL,
                          id_remite BIGINT NOT NULL,
                          id_destinatario BIGINT NOT NULL,
                          fecha_envio DATETIME NOT NULL,
                          leido BOOLEAN,
                          FOREIGN KEY (id_remite) REFERENCES usuarios(id),
                          FOREIGN KEY (id_destinatario) REFERENCES usuarios(id)
);

-- Crear tabla chat_mensajes
CREATE TABLE chat_mensajes (
                               id BIGINT PRIMARY KEY AUTO_INCREMENT,
                               id_remitente BIGINT NOT NULL,
                               id_destinatario BIGINT NOT NULL,
                               contenido VARCHAR(255) NOT NULL,
                               fecha_envio DATETIME NOT NULL,
                               FOREIGN KEY (id_remitente) REFERENCES usuarios(id),
                               FOREIGN KEY (id_destinatario) REFERENCES usuarios(id)
);

CREATE TABLE puntuaciones (
                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                              id_usuario_acosado BIGINT NOT NULL,
                              id_destinatario_ayuda BIGINT NOT NULL,
                              puntuacion INT NOT NULL,
                              FOREIGN KEY (id_usuario_acosado) REFERENCES usuarios (id),
                              FOREIGN KEY (id_destinatario_ayuda) REFERENCES usuarios (id)
);

CREATE TABLE incidencias (
                             id BIGINT PRIMARY KEY AUTO_INCREMENT,
                             descripcion VARCHAR(255) NOT NULL,
                             fecha_hora DATETIME NOT NULL,
                             id_usuario BIGINT,
                             estado VARCHAR(20),
                             prioridad VARCHAR(20),
                             comentarios TINYTEXT,-- Algunos han tenido que poner un TINYTEXT

                             FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);

CREATE TABLE historial_acciones (
                                    id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                    id_usuario BIGINT NOT NULL,
                                    accion VARCHAR(255) NOT NULL,
                                    fecha DATETIME NOT NULL,
                                    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);

CREATE TABLE palabras (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          palabra VARCHAR(255)
);