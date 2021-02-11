package com.thiagosoares.futebol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosoares.futebol.model.Cidade;
import com.thiagosoares.futebol.repositories.CidadeRepository;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping
	public List<Cidade> buscarTodos(){
		return cidadeRepository.findAll();
	}

}
