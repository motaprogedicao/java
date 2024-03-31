package com.aula4;

public class Main {
	

public static void main (String[] args) {

	Cliente c = new Cliente("Guilherme",2000.00,1000.00);
	c.obterNome();
    c.sacar(500.00);
    c.checarSaldo();
    c.depositar(250.00);
    c.checarSaldo();
    c.sacar(3050.00);
	
}

}