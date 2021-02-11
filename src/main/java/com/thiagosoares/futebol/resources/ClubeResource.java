package com.thiagosoares.futebol.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosoares.futebol.model.Clube;
import com.thiagosoares.futebol.repositories.ClubeRepository;

@RestController
@RequestMapping("/clubes")
public class ClubeResource {

	@Autowired
	private ClubeRepository clubeRepository;

	@GetMapping
	public List<Clube> listar() {
		return clubeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPeloId(@PathVariable Long id) {
		Optional<Clube> cliente = clubeRepository.findById(id);
		return !cliente.isEmpty() ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
	}

}
