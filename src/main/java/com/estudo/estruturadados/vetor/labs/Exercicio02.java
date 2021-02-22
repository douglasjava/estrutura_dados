package com.estudo.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.estudo.estruturadados.vetor.Lista;

/**
 * O método lastIndexOf retorna a última vez que o registro informado aparece na
 * coleção
 * 
 * @author Marques
 *
 */
public class Exercicio02 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("A");

		System.out.println(lista.lastIndexOf("A"));
		
		Lista<String> lista1 = new Lista<>(10);
		lista1.adiciona1("F");
		lista1.adiciona1("A");
		lista1.adiciona1("F");
		lista1.adiciona1("C");
		
		System.out.println(lista1.ultimoIndice("F"));

	}

}
