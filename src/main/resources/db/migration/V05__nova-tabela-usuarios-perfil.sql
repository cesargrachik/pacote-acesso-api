CREATE TABLE usuarios_perfil (codigo_usuario int8,
 codigo_perfil int8,
  PRIMARY KEY (codigo_usuario, codigo_perfil),
  FOREIGN KEY (codigo_usuario) REFERENCES usuarios(id_usuario),
  FOREIGN KEY (codigo_perfil) REFERENCES perfil(id_perfil)
 );