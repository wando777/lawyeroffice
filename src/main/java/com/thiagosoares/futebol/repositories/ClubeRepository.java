package com.thiagosoares.futebol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagosoares.futebol.model.Clube;

@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long>{

}
