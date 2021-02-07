package com.thiagosoares.futebol.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagosoares.futebol.model.Estado;
import com.thiagosoares.futebol.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}
	
	public Estado findById(Long id) {
		Optional<Estado> obj = estadoRepository.findById(id);
		return obj.orElse(null);
	}

}
