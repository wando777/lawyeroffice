package com.thiagosoares.futebol.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosoares.futebol.model.Jogador;
import com.thiagosoares.futebol.repositories.JogadorRepository;

@RestController
@RequestMapping("/jogadores")
public class JogadorResource {

	@Autowired
	private JogadorRepository jogadorRepository;

	@GetMapping
	public List<Jogador> listar() {
		List<Jogador> jogadores = jogadorRepository.findAll();
		return jogadores;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPeloId(@PathVariable Long id) {
		Optional<Jogador> jogador = jogadorRepository.findById(id);
		return !jogador.isEmpty() ? ResponseEntity.ok(jogador) : ResponseEntity.notFound().build();
	}

}
