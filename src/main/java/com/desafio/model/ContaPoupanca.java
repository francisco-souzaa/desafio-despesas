package com.desafio.model;

public class ContaPoupanca {
	
	private String nome;
	public static String tipoContaPoupanca = "CONTA POUPANCA";
	private double saldo;
	private double valorTransferencia;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValorTransferencia() {
		return valorTransferencia;
	}
	public void setValorTransferencia(double valorTransferencia) {
		this.valorTransferencia = valorTransferencia;
	}

}
