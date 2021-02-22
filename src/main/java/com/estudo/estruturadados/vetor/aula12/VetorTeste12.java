package com.estudo.estruturadados.vetor.aula12;

import java.util.ArrayList;

public class VetorTeste12 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();

		lista.add("A");
		lista.add("C");
		lista.add(1, "B");

		System.out.println(lista);

		boolean exist = lista.contains("A");
		if (exist) {
			System.out.println("Elemento existe no Array");
		} else {
			System.out.println("Elemento não existe no Array");
		}

		int pos = lista.indexOf("D");
		if (pos > -1) {
			System.out.println("Elemento existe no Array na posicao: " + pos);
		} else {
			System.out.println("Elemento não existe no Array na posicao: " + pos);
		}
		
		System.out.println(lista.get(2));
		
		lista.remove(2);
		
		System.out.println(lista);
		
		System.out.println(lista.size());

	}

}
