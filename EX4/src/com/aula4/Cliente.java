package com.aula4;

public class Cliente {

	String nome;
	private double saldo;
	private double limite;

	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public boolean sacar(double quantia) {

		if (quantia <= this.saldo + this.limite) {
			this.saldo = this.saldo - quantia;
			System.out.println("Valor sacado: " + quantia);
			return true;

		} else {
			return false;
		}
	}

	public double depositar(double deposito) {
		System.out.println("Valor depositado: " + deposito);
		this.saldo = this.saldo + deposito;
		return saldo;
	}
	
	public void checarSaldo() {
		double saldototal;
		
		saldototal = saldo + limite;
		
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite " + this.limite);
		System.out.println("Saldo total: " + saldototal);
	}
	
	public void obterNome() {
		System.out.println("Nome: " + this.nome);
	}

}
