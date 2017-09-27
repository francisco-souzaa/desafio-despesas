package com.desafio.controller;

import java.math.BigDecimal;

public class Historico {
	
	private String observacoes;
	
	private BigDecimal saldoAtual;
	
	private BigDecimal saldoAnterior;


	public BigDecimal getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(BigDecimal saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	public BigDecimal getSaldoAnterior() {
		return saldoAnterior;
	}
	public void setSaldoAnterior(BigDecimal saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
