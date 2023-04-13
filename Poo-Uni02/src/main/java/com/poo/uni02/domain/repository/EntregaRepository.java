package com.poo.uni02.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.uni02.domain.model.Entrega;
@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>{

}
