package com.estudo.estruturadados.vetor.aula8;

import com.estudo.estruturadados.vetor.Vetor;

public class VetorTeste08 {

	public static void main(String[] args) {
		 
		try {

			Vetor vetor = new Vetor(3);

			vetor.adiciona1("B");
			vetor.adiciona1("C");
			vetor.adiciona1("E");
			vetor.adiciona1("F");
			vetor.adiciona1("G");

			System.out.println(vetor);

		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}

		
	}
	
}
