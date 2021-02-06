package com.thiagosoares.futebol.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiagosoares.futebol.model.Estado;
import com.thiagosoares.futebol.repository.EstadoRepository;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

	private EstadoRepository estadoRespository;

	@RequestMapping(method = RequestMethod.GET)
	public String toList() {
		// return estadoRespository.findAll();
		return "TESTANDO REST";
	}

}
