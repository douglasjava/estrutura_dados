package com.estudo.estruturadados.pilhas.aula17;

import com.estudo.estruturadados.pilhas.Pilha;

/**
 * LIFO Last In First Out -
 * 
 * @apiNote último elemento empilihado será o primeiro a ser desempilhado
 * 
 * @author Marques
 *
 */
public class Aula17 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();

		pilha.empilha(1);
		pilha.empilha(6);
		pilha.empilha(3);
		pilha.empilha(2);

		System.out.println(pilha);

		System.out.println("Desempilha: " + pilha.desempilha());

		System.out.println(pilha);

		System.out.println("Desempilha: " + pilha.desempilha());

		System.out.println(pilha);

	}

}
