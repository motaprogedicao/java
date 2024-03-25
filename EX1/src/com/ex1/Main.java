package com.ex1;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa ("Guilherme","M",25,false);
		Pessoa p2 = new Pessoa ("Amanda","F",26,false);
		Pessoa p3 = new Pessoa ("Juca","M",7,true);
		Pessoa p4 = new Pessoa ("Samuel","M",2,false);
		
		
		Churrasco c = new Churrasco();
		p1.mostrar(p1);
		c.verificarConsumo(p1);
		p2.mostrar(p2);
		c.verificarConsumo(p2);
		p3.mostrar(p3);
		c.verificarConsumo(p3);
		p4.mostrar(p4);
		c.verificarConsumo(p4);
	}

}
