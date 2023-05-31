
<<<<<<< HEAD
INSERT INTO usuarios (id_tipo, email, foto, latitud, longitud, pass, fecha_nacimiento, usuario_desde, token, sexo, nombre, apellido1, apellido2, curso, direccion, ciudad, codigo_postal, pais, telefono, logueado)
VALUES (1, 'usuario1@email.com', 'foto1.jpg', 0.0, 0.0, 'contraseña1', '1990-01-01', NOW(), 'token1', 'Masculino', 'Usuario', 'Uno', NULL, 'Informática', 'Calle Ejemplo 1', 'Ciudad Ejemplo', 12345, 'País Ejemplo', '123456789', 0);

INSERT INTO usuarios (id_tipo, email, foto, latitud, longitud, pass, fecha_nacimiento, usuario_desde, token, sexo, nombre, apellido1, apellido2, curso, direccion, ciudad, codigo_postal, pais, telefono, logueado)
VALUES (1, 'usuario2@email.com', 'foto2.jpg', 0.0, 0.0, 'contraseña2', '1990-01-01', NOW(), 'token2', 'Femenino', 'Usuario', 'Dos', NULL, 'Informática', 'Calle Ejemplo 2', 'Ciudad Ejemplo', 54321, 'País Ejemplo', '987654321', 0);

INSERT INTO mensajes (contenido, remite_id, destinatario_id, fecha_envio, leido)
VALUES ('Hola, ¿cómo estás?', 1, 2, NOW(), false);

INSERT INTO mensajes (contenido, remite_id, destinatario_id, fecha_envio, leido)
VALUES ('Hola, estoy bien. ¿Y tú?', 2, 1, NOW(), false);

INSERT INTO chat_mensajes (remitente_id, destinatario_id, contenido, fecha_envio)
VALUES (1, 2, 'Hola, ¿cómo estás en el chat?', NOW());

INSERT INTO chat_mensajes (remitente_id, destinatario_id, contenido, fecha_envio)
VALUES (2, 1, '¡Hola! Estoy bien, gracias.', NOW());

INSERT INTO puntuaciones (usuario_acosado_id, usuario_ayuda_id, puntuacion)
VALUES (1, 2, 5);

INSERT INTO puntuaciones (usuario_acosado_id, usuario_ayuda_id, puntuacion)
VALUES (2, 1, 4);

INSERT INTO incidencias (descripcion, fecha_hora, usuario_id, estado, prioridad, comentarios)
VALUES ('Problema técnico', NOW(), 1, 'En proceso', 'Alta', 'Comentario sobre la incidencia');

INSERT INTO incidencias (descripcion, fecha_hora, usuario_id, estado, prioridad, comentarios)
VALUES ('Error en el sistema', NOW(), 2,'En proceso','Alta','Comentario sobre la incidencia');

INSERT INTO incidencias (descripcion, fecha_hora, usuario_id, estado, prioridad, comentarios)
VALUES ('Error en el sistema', NOW(), 2, 'En proceso', 'Media', 'Comentario sobre el error');

INSERT INTO palabras (palabra) VALUES ('gilipollas');
INSERT INTO palabras (palabra) VALUES ('imbécil');
INSERT INTO palabras (palabra) VALUES ('cabrón');
INSERT INTO palabras (palabra) VALUES ('cabrona');
INSERT INTO palabras (palabra) VALUES ('Subnormal');
INSERT INTO palabras (palabra) VALUES ('hijoputa');
INSERT INTO palabras (palabra) VALUES ('hijaputa');
INSERT INTO palabras (palabra) VALUES ('hijo de puta');
INSERT INTO palabras (palabra) VALUES ('hija de puta');
INSERT INTO palabras (palabra) VALUES ('tonto');
INSERT INTO palabras (palabra) VALUES ('tonta');
INSERT INTO palabras (palabra) VALUES ('puta');
INSERT INTO palabras (palabra) VALUES ('puto');
INSERT INTO palabras (palabra) VALUES ('capullo');
INSERT INTO palabras (palabra) VALUES ('capulla');
INSERT INTO palabras (palabra) VALUES ('payaso');
INSERT INTO palabras (palabra) VALUES ('payasa');

=======
INSERT INTO palabras (palabra) VALUES ('gilipollas'),
                                      ('imbécil'),
                                      ('cabrón'),
                                      ('cabrona'),
                                      ('Subnormal'),
                                      ('hijoputa'),
                                      ('hijaputa'),
                                      ('hijo de puta'),
                                      ('hija de puta'),
                                      ('tonto'),
                                      ('tonta'),
                                      ('puta'),
                                      ('puto'),
                                      ('capullo'),
                                      ('capulla'),
                                      ('payaso'),
                                      ('payasa');
>>>>>>> origin/master
