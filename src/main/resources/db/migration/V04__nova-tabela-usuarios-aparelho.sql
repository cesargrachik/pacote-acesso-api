CREATE TABLE usuarios_aparelhos (codigo_usuario int8,
 codigo_aparelho int8,
  PRIMARY KEY (codigo_usuario, codigo_aparelho),
  FOREIGN KEY (codigo_usuario) REFERENCES usuarios(id_usuario),
  FOREIGN KEY (codigo_aparelho) REFERENCES aparelhos(id_aparelho)
 );