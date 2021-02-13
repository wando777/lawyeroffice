package com.thiagosoares.futebol.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagosoares.futebol.model.Clube;
import com.thiagosoares.futebol.repositories.ClubeRepository;

import com.thiagosoares.futebol.services.exceptions.ObjectNotFoundException;

@Service
public class ClubeService {

	@Autowired
	private ClubeRepository clubeRepository;

	public Clube findClube(Long id) {
		Optional<Clube> clube = clubeRepository.findById(id);
		if (clube.isEmpty()) {
			throw new ObjectNotFoundException(
					"Clube não encontrado com id: " + id + ", tipo: " + Clube.class.getName());
		}
		return clube.get();
	}

//	public Optional<Clube> findClube(Long id) {
//		Optional<Clube> obj = clubeRepository.findById(id);
//		if (obj.isEmpty()) {
//			throw new ObjectNotFoundException("Objeto não encontrado, ID: " + id);
//		}
//		return obj;
//	}

}
