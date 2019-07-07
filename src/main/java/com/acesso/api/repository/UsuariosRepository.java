package com.acesso.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.acesso.api.model.Usuarios;

public interface UsuariosRepository  extends JpaRepository<Usuarios, Long>{
	
	public Page<Usuarios> findByNomeContaining(String nome, Pageable pageable);

}
