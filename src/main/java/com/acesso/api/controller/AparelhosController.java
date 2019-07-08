package com.acesso.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acesso.api.model.Aparelhos;
import com.acesso.api.repository.AparelhosRepository;

@CrossOrigin
@RestController
@RequestMapping("/aparelhos")
public class AparelhosController {
	
	@Autowired
	AparelhosRepository aparelhosRepository;
	
	
	@GetMapping
	public Page<Aparelhos> pesquisar(@RequestParam(required = false, defaultValue = "") String descricaoAparelho, Pageable pageable) {
		Page<Aparelhos> us = aparelhosRepository.findByDescricaoAparelhoContaining(descricaoAparelho, pageable);
		return us;
	}
	

	@GetMapping("/todos")
	public List<Aparelhos> listar() {
		return aparelhosRepository.findAll();
	}

}
