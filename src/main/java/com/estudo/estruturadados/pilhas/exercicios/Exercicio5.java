package com.estudo.estruturadados.pilhas.exercicios;

import java.util.Stack;

import com.estudo.estruturadados.pilhas.Pilha;

public class Exercicio5 {

	public static void main(String[] args) {

		imprimeResultado("ADA");

		imprimeResultado("BOI");

		imprimeResultado("ABCCBA");

		imprimeResultadoStack("ADA");

		imprimeResultadoStack("BOI");

		imprimeResultadoStack("ABCCBA");

	}

	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " é um palindromo? " + testaPalindromo(palavra));
	}

	public static void imprimeResultadoStack(String palavra) {
		System.out.println(palavra + " é um palindromo? " + testaPalindromo(palavra));
	}

	/**
	 * 
	 * @param palavra
	 * @return
	 */
	public static boolean testaPalindromo(String palavra) {

		// Palavra original ADA
		// [A]
		// [D]
		// [A]

		// A D A

		Pilha<Character> pilha = new Pilha<>();

		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}

		String palavraInversa = "";
		while (!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}

	public static boolean testaPalindromoComStack(String palavra) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < palavra.length(); i++) {
			stack.push(palavra.charAt(i));
		}

		String palavraInversa = "";
		while (!stack.isEmpty()) {
			palavraInversa += stack.peek();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}

}
