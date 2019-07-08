package com.acesso.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acesso.api.model.Perfil;
import com.acesso.api.repository.PerfilRepository;

@CrossOrigin
@RestController
@RequestMapping("/perfil")
public class PerfilController {
	
	@Autowired
	PerfilRepository perfilRepository;
	
	@GetMapping
	public Page<Perfil> pesquisar(@RequestParam(required = false, defaultValue = "") String nomePerfil, Pageable pageable) {
		Page<Perfil> us = perfilRepository.findByNomePerfilContaining(nomePerfil, pageable);
		return us;
	}
	

	@GetMapping("/todos")
	public List<Perfil> listar() {
		return perfilRepository.findAll();
	}
	
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		perfilRepository.deleteById(codigo);
	}

}
