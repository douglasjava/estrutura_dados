package com.estudo.estruturadados.vetor.labs;

import com.estudo.estruturadados.vetor.Lista;

public class Exercicio01 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<>(5);

		lista.adiciona1("A");
		lista.adiciona1("B");
		lista.adiciona1("C");

		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("P"));
		System.out.println(lista.contem("B"));

	}

}
