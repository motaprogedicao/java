package com.ex1;

public class Pessoa {

	 String nome;
	 String sexo;
	 int idade;
	 boolean vegetariana;
	
	public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	
	public void mostrar(Pessoa p) {
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("Vegetariano: " + vegetariana);
	}
	
	}
