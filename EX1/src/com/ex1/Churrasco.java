package com.ex1;

public class Churrasco {

 double qtdCarne;	
	
	 public void verificarConsumo(Pessoa pessoa) {
		 
		if(pessoa.idade >= 13) {
			
			qtdCarne = 2;
			System.out.println("Consumo: " + qtdCarne + "kg");
			
		}else {
			
			if(pessoa.idade >= 4 && pessoa.idade <= 12) {
			
			qtdCarne = 1;
			System.out.println("Consumo: "+ qtdCarne + "kg");
			
		    }else {
			
			     if(pessoa.idade <= 3 && pessoa.idade >= 0) {
			
			     qtdCarne = 0;
			     System.out.println("Consumo: " + qtdCarne + "kg");
			
		         }else {
		 	
		               }
		
		           }
			
		if(pessoa.vegetariana==true) {
			
			qtdCarne = 0;
			System.out.println("Consumo: " + qtdCarne + "kg" );
		}
		
		}


}
	 
}
