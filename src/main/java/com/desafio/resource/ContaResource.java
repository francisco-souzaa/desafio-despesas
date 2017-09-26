package com.desafio.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.model.Conta;
import com.desafio.repository.ContaRepository;

@RestController
@RequestMapping("/conta")
public class ContaResource {
	
	@Autowired
	private ContaRepository contaRepository;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public void add(@RequestBody Conta conta) {
		contaRepository.save(conta);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Conta recuperar(Long id){
		Conta conta = contaRepository.findById(id);
		return conta;
	}
	
	
	
	 public Conta verificarSaldo(@RequestBody Long numero){
		 return contaRepository.findOne(numero);
	}

}


