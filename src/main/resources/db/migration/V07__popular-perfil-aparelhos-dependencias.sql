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

INSERT INTO public.perfil(
	id_perfil, nome_perfil)
	VALUES (4, 'Vendedor Externo');	
	
INSERT INTO public.perfil(
	id_perfil, nome_perfil)
	VALUES (5, 'Comprador');	

INSERT INTO public.perfil(
	id_perfil, nome_perfil)
	VALUES (6, 'Auxiliar Administrativo');		
	
	
/* Popular Tabela de Usuario Perfil */ 	
	
INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (1, 1);

INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (1, 2);

INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (1, 3);

INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (2, 3);

INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (2, 4);

INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (2, 5);


INSERT INTO public.usuarios_perfil(
codigo_usuario, codigo_perfil)
VALUES (3, 2);

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

INSERT INTO public.aparelhos(
id_aparelho, descricao_aparelho, codigo_aparelho)
VALUES (4, 'Cabo USB', 'Cabo USB');	

INSERT INTO public.aparelhos(
id_aparelho, descricao_aparelho, codigo_aparelho)
VALUES (5, 'Teclado', 'Teclado');	

INSERT INTO public.aparelhos(
id_aparelho, descricao_aparelho, codigo_aparelho)
VALUES (6, 'Mouse', 'Mouse');	

/* Popular Tabela de  Usuario Aparelho*/ 	

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (1, 1);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (1, 3);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (1, 5);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (2, 1);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (2, 2);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (2, 3);


INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (3, 5);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (3, 2);

INSERT INTO public.usuarios_aparelhos(
codigo_usuario, codigo_aparelho)
VALUES (3, 3);