package com.estudo.estruturadados.vetor.aula5;

import com.estudo.estruturadados.vetor.Vetor;

public class VetorTeste05 {

	public static void main(String[] args) {

		try {

			Vetor vetor = new Vetor(5);

			vetor.adiciona1("elemento 1");
			vetor.adiciona1("elemento 2");
			vetor.adiciona1("elemento 3");

			System.out.println(vetor.busca(2));

		} catch (Exception e) {
			System.err.println(e.getMessage());

		}

	}

}
