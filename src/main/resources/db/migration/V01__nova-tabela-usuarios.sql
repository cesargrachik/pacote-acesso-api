CREATE TABLE usuarios (id_usuario SERIAL PRIMARY KEY,
 nome varchar(60),
 login varchar(12),
 email varchar(60),
 senha varchar(45),
 data_criacao timestamptz,
 tempo_expiracao_senha int4,
 cod_autorizacao varchar(1),
 status_usuario varchar(1),
 cod_pessoa int8
 );