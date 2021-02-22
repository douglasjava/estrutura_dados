package com.estudo.estruturadados.pilhas.exercicios;

import java.util.Stack;

/**
 * <b>Quebra Torre de Hanoi.</b>
 * 
 * @author Marques
 *
 */
public class Exercicio8 {

	public static void main(String[] args) {

		Stack<Integer> stackOriginal = new Stack<>();
		Stack<Integer> stackDestino = new Stack<>();
		Stack<Integer> stackAux = new Stack<>();

		stackOriginal.push(4);
		stackOriginal.push(3);
		stackOriginal.push(2);
		stackOriginal.push(1);

		torreDeHanoi(stackOriginal.size(), stackOriginal, stackDestino, stackAux);

	}

	public static void torreDeHanoi(int n, Stack<Integer> stackOriginal, Stack<Integer> stackDestino,
			Stack<Integer> stackAux) {

		if (n > 0) {
			torreDeHanoi(n - 1, stackOriginal, stackAux, stackDestino);
			stackDestino.push(stackOriginal.pop());
			System.out.println("--------------");
			System.out.println("Original: " + stackOriginal);
			System.out.println("Destino: " + stackDestino);
			System.out.println("Auxiliar: " + stackAux);
			torreDeHanoi(n - 1, stackAux, stackDestino, stackOriginal);
		}

	}

}
