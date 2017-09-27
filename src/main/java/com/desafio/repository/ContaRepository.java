package com.desafio.repository;

import org.springframework.data.repository.CrudRepository;

import com.desafio.model.Conta;

public interface ContaRepository extends CrudRepository<Conta, Long> {
	
	Conta findById(Long id);
	Conta findByNumero(Long numero);

}
