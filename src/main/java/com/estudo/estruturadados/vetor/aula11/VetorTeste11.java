package com.estudo.estruturadados.vetor.aula11;

import com.estudo.estruturadados.vetor.Lista;

public class VetorTeste11 {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista<>(1);

		vetor.adiciona1("Elemento 1");
		vetor.adiciona1("Elemento 2");

		boolean exist = vetor.busca("Elemento 2");

		System.out.println(exist);

		System.out.println(vetor);
	}

}
