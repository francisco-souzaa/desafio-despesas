package com.desafio.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conta{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="numero", nullable=false, unique=true)
	private Long numero;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="saldo", nullable=false)
	private BigDecimal saldo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	
}
