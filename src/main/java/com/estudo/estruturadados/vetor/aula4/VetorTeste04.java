package com.estudo.estruturadados.vetor.aula4;

import com.estudo.estruturadados.vetor.Vetor;

public class VetorTeste04 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		vetor.adiciona1("elemento 1");
		vetor.adiciona1("elemento 2");
		vetor.adiciona1("elemento 3");

		System.out.println(vetor.tamanho());
		
		System.out.println(vetor);

	}

}
