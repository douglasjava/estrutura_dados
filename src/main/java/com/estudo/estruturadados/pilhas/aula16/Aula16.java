package com.estudo.estruturadados.pilhas.aula16;

import com.estudo.estruturadados.pilhas.Pilha;

public class Aula16 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();

		System.out.println(pilha.topo());

		System.out.println(pilha);

		pilha.empilha(1);

		pilha.empilha(5);

		System.out.println(pilha.topo());

		System.out.println(pilha);
	}

}
