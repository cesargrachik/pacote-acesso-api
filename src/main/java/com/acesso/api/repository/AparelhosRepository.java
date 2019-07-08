package com.acesso.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.acesso.api.model.Aparelhos;

public interface AparelhosRepository extends JpaRepository<Aparelhos, Long>{
	
	public Page<Aparelhos> findByDescricaoAparelhoContaining(String descricaoAparelho, Pageable pageable);

}
