package com.estudo.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.estudo.estruturadados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("A");

		System.out.println(lista.get(1));


		Lista<String> lista1 = new Lista<>(10);
		lista1.adiciona1("F");
		lista1.adiciona1("A");
		lista1.adiciona1("F");
		lista1.adiciona1("C");

		System.out.println(lista1.obtem(2));
		
		System.out.println(lista1.obtem(20));


	}

}
