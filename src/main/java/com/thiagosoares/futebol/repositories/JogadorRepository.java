package com.thiagosoares.futebol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagosoares.futebol.model.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long>{

}
