package com.estudo.estruturadados.vetor.aula6;

import com.estudo.estruturadados.vetor.Vetor;

public class VetorTeste06 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);

		vetor.adiciona1("elemento 1");
		vetor.adiciona1("elemento 2");
		vetor.adiciona1("elemento 3");

		System.out.println(vetor.buscaPosicao("elementO 1"));
		
	}

}
