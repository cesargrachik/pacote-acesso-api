package com.acesso.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.acesso.api.model.Usuarios;
import com.acesso.api.repository.UsuariosRepository;

@Service
public class UsuarioService {


	@Autowired
	UsuariosRepository usuariosRepository;
	
	public void atualizarPropriedadeAtivo(Long codigo, String ativo) {
		Usuarios usuarioSalva = buscarPessoaPeloCodigo(codigo);
		if (ativo.equals("true"))  
			usuarioSalva.setStatus_usuario("A"); 
		  else 
	        usuarioSalva.setStatus_usuario("I");  
    	usuariosRepository.save(usuarioSalva);
	}
	
	public Usuarios atualizar(Long codigo, Usuarios usuarios) {
		Optional<Usuarios> usuarioSalva = usuariosRepository.findById(codigo);
		
		

		if (!usuarioSalva.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
        
		BeanUtils.copyProperties(usuarios, usuarioSalva,"codigo"); 
		usuarios.setId_usuario(codigo);
		return usuariosRepository.save(usuarios);
	}


	public Usuarios buscarPessoaPeloCodigo(Long codigo) {
		Optional<Usuarios> usuarioSalva = usuariosRepository.findById(codigo);
		if (usuarioSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return usuarioSalva.get();
	}
}
