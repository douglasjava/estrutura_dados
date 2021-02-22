package com.estudo.estruturadados.vetor.aula7;

import com.estudo.estruturadados.vetor.Vetor;

public class VetorTeste07 {

	public static void main(String[] args) {

		try {

			Vetor vetor = new Vetor(10);

			vetor.adiciona1("B");
			vetor.adiciona1("C");
			vetor.adiciona1("E");
			vetor.adiciona1("F");
			vetor.adiciona1("G");

			System.out.println(vetor);

			vetor.adicionarElementoNaPosicao(2, "A");

			System.out.println(vetor);

		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		}

	}

}
