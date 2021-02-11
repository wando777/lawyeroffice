package com.thiagosoares.futebol.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosoares.futebol.model.Estado;
import com.thiagosoares.futebol.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;

//	@Autowired
//	private CidadeService cidadeService;

	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public List<Estado> getAll() {
		return estadoService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getById(@PathVariable Long id) {
		Estado obj = estadoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
