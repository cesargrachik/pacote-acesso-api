package com.acesso.api.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acesso.api.event.RecursoCriadoEvent;
import com.acesso.api.model.Usuarios;
import com.acesso.api.repository.UsuariosRepository;
import com.acesso.api.service.UsuarioService;




@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	UsuariosRepository usuariosRepository;
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public Page<Usuarios> pesquisar(@RequestParam(required = false, defaultValue = "") String nome, Pageable pageable) {
		Page<Usuarios> us = usuariosRepository.findByNomeContaining(nome, pageable);
		return us;
	}
	
	@GetMapping("/todos")
	public List<Usuarios> listar() {
		return usuariosRepository.findAll();
	}
	
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Usuarios> buscar(@PathVariable Long codigo) {
		Optional<Usuarios> usuarios = usuariosRepository.findById(codigo);
		
		if (!usuarios.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(usuarios.get());
	}
	
	
	@PutMapping("/{codigo}/ativo")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizarPropriedadeAtivo(@PathVariable Long codigo, @RequestBody String ativo) {
		usuarioService.atualizarPropriedadeAtivo(codigo, ativo);
	}

	
    @PutMapping("/{codigo}") 
	public ResponseEntity<Usuarios> atualizar(@PathVariable Long codigo, @Valid @RequestBody Usuarios usuarios) {
	    return ResponseEntity.ok(usuarioService.atualizar(codigo, usuarios)); 
	}
    
    
	@PostMapping
	public ResponseEntity<Usuarios> criar(@Valid @RequestBody Usuarios usuario, HttpServletResponse response) {
		LocalDate hoje = LocalDate.now();
		usuario.setData_criacao(hoje);
		Usuarios usuarioSalvo = usuariosRepository.save(usuario);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, usuarioSalvo.getId_usuario()));
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		usuariosRepository.deleteById(codigo);
	}

}
