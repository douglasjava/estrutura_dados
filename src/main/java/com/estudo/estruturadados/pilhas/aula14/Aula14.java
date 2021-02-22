package com.estudo.estruturadados.pilhas.aula14;

import com.estudo.estruturadados.pilhas.Pilha;

public class Aula14 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();

		for (int i = 0; i < 50; i++) {
			pilha.empilha(i);
		}

		System.out.println(pilha);
		System.out.println(pilha.tamanho());

	}

}
