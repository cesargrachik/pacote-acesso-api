package com.acesso.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.acesso.api.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Long>{
	
	public Page<Perfil> findByNomePerfilContaining(String nomePerfil, Pageable pageable);
	
}
