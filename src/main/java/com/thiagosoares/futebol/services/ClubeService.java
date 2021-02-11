package com.thiagosoares.futebol.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.thiagosoares.futebol.model.Clube;
import com.thiagosoares.futebol.repositories.ClubeRepository;

import javassist.NotFoundException;

@Service
public class ClubeService {

	private ClubeRepository clubeRepository;

	public Clube findClube(Long id) throws NotFoundException {
		Optional<Clube> obj = clubeRepository.findById(id);

		if (obj.isEmpty()) {
			throw new NotFoundException("Não encontrado");
		}
		Clube clubeSalvo = obj.get();
		return clubeSalvo;
	}

}
