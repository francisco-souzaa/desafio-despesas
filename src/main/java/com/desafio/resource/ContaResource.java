package com.desafio.resource;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.controller.Historico;
import com.desafio.model.Conta;
import com.desafio.repository.ContaRepository;

@RestController
@RequestMapping("/conta")
public class ContaResource {
	
	@Autowired
	private ContaRepository contaRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public void criar(@RequestBody Conta conta) {
		contaRepository.save(conta);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Conta recuperar(@PathVariable("id") Long id){
		Conta conta = contaRepository.findById(id);
		return conta;
	}
	
	@RequestMapping(value = "/saldo/{id}", method = RequestMethod.GET)
	public BigDecimal verificarSaldo(@PathVariable("id") Long id){
		Conta conta = recuperar(id);
		return conta.getSaldo();
	}
	
	
	@RequestMapping(value = "/transfer/{idOrigem}/{valor}/{idDestino}", method = RequestMethod.GET)
	public void transferir(@PathVariable("idOrigem") Long idOrigem, 
			@PathVariable("valor") BigDecimal valor, @PathVariable("idDestino") Long idDestino){
		Historico historico = new Historico();
		Conta contaO = recuperar(idOrigem);
		Conta contaD = recuperar(idDestino);
		if(contaO.getSaldo() != null){
			historico.setSaldoAnterior(contaO.getSaldo());
			contaO.setSaldo(contaO.getSaldo().subtract(valor));
			contaD.setSaldo(contaD.getSaldo().add(valor));
			historico.setSaldoAtual(contaO.getSaldo());
			contaRepository.save(contaO);
		}
	}
	
}


