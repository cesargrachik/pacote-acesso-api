package com.acesso.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acesso.api.event.RecursoCriadoEvent;
import com.acesso.api.model.Aparelhos;
import com.acesso.api.repository.AparelhosRepository;

@CrossOrigin
@RestController
@RequestMapping("/aparelhos")
public class AparelhosController {
	
	@Autowired
	AparelhosRepository aparelhosRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	
	@GetMapping
	public Page<Aparelhos> pesquisar(@RequestParam(required = false, defaultValue = "") String descricaoAparelho, Pageable pageable) {
		Page<Aparelhos> us = aparelhosRepository.findByDescricaoAparelhoContaining(descricaoAparelho, pageable);
		return us;
	}
	

	@GetMapping("/todos")
	public List<Aparelhos> listar() {
		return aparelhosRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Aparelhos> criar(@Valid @RequestBody Aparelhos aparelhos, HttpServletResponse response) {
		Aparelhos aparelhosSalvo = aparelhosRepository.save(aparelhos);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, aparelhosSalvo.getId_aparelho()));
		return ResponseEntity.status(HttpStatus.CREATED).body(aparelhosSalvo);
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		aparelhosRepository.deleteById(codigo);
	}

}
