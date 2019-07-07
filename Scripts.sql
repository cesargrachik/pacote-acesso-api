/* Popular Tabela de Perfil */ 

INSERT INTO public.perfil(
	id_perfil, nome_perfil)
VALUES (1, 'Administrador');
	
INSERT INTO public.perfil(
	id_perfil, nome_perfil)
	VALUES (2, 'Gerente');	

INSERT INTO public.perfil(
	id_perfil, nome_perfil)
	VALUES (3, 'Vendedor');
	
/* Popular Tabela de Usuario Perfil */ 	
	
INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (2, 1);

INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (2, 2);

INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (2, 3);

/* Popular Tabela de Aparelhos */ 	

INSERT INTO public.aparelhos(
id_aparelho, descricao_aparelho, codigo_aparelho)
VALUES (1, 'NoteBook', 'NoteBook');

INSERT INTO public.aparelhos(
id_aparelho, descricao_aparelho, codigo_aparelho)
VALUES (2, 'Monitor', 'Monitor');

INSERT INTO public.aparelhos(
id_aparelho, descricao_aparelho, codigo_aparelho)
VALUES (3, 'HD Externo', 'HD Externo');	

/* Popular Tabela de  Usuario Aparelho*/ 	

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (2, 1);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (2, 2);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (2, 3);
