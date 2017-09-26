package com.desafio.controller;

public class Historico {
	
	private String observacoes;
	private double saldoAtualCC;
	private double saldoAtualCP;
	private double saldoAnteriorCC;
	private double saldoAnteriorCP;
	
	public double getSaldoAnteriorCC() {
		return saldoAnteriorCC;
	}
	public void setSaldoAnteriorCC(double saldoAnteriorCC) {
		this.saldoAnteriorCC = saldoAnteriorCC;
	}
	public double getSaldoAnteriorCP() {
		return saldoAnteriorCP;
	}
	public void setSaldoAnteriorCP(double saldoAnteriorCP) {
		this.saldoAnteriorCP = saldoAnteriorCP;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public double getSaldoAtualCC() {
		return saldoAtualCC;
	}
	public void setSaldoAtualCC(double saldoAtualCC) {
		this.saldoAtualCC = saldoAtualCC;
	}
	public double getSaldoAtualCP() {
		return saldoAtualCP;
	}
	public void setSaldoAtualCP(double saldoAtualCP) {
		this.saldoAtualCP = saldoAtualCP;
	}

}
