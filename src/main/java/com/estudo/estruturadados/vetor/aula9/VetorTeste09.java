package com.estudo.estruturadados.vetor.aula9;

import com.estudo.estruturadados.vetor.Vetor;

public class VetorTeste09 {

	public static void main(String[] args) {

		try {

			Vetor vetor = new Vetor(10);

			vetor.adiciona1("B");
			vetor.adiciona1("C");
			vetor.adiciona1("E");
			vetor.adiciona1("F");
			vetor.adiciona1("G");

			System.out.println(vetor);

			int posicao = vetor.buscaPosicao("J");
			if (posicao >= 0) {
				vetor.removerElementoNaPosicao(posicao);
			} else {
				System.err.println("Elemento não existe no vetor");
			}

			System.out.println(vetor);

		} catch (Exception e) {
			System.err.println(e.getMessage());

		}

	}

}
