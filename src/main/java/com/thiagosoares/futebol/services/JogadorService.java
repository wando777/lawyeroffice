package com.thiagosoares.futebol.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagosoares.futebol.model.Jogador;
import com.thiagosoares.futebol.repositories.JogadorRepository;
import com.thiagosoares.futebol.services.exceptions.ObjectNotFoundException;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository jogadorRepository;

	public Jogador findJogador(Long id) {
		Optional<Jogador> obj = jogadorRepository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Jogador não encontrado com id: " + id + ", tipo: " + Jogador.class.getName()));
	}

}
