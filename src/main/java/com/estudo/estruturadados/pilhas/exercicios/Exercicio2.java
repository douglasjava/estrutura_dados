package com.estudo.estruturadados.pilhas.exercicios;

import java.util.Scanner;

import com.estudo.estruturadados.pilhas.Pilha;

public class Exercicio2 {

	public static void main(String[] args) {

		Pilha<Integer> pilhaImpar = new Pilha<Integer>();
		Pilha<Integer> pilhaPar = new Pilha<Integer>();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Entre com um número: ");

			int num = scanner.nextInt();

			if (num == 0) {

				Integer desempilhado = pilhaPar.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha par vazia");

				} else {
					System.out.println("Desempilhando da pilha par: " + num);

				}

				desempilhado = pilhaImpar.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha impar vazia");

				} else {
					System.out.println("Desempilhando da pilha impar: " + num);

				}

			} else if (num % 2 == 0) {

				System.out.println("Número par, empilhando na pilha par: " + num);
				pilhaPar.empilha(num);

			} else {

				System.out.println("Número par, empilhando na pilha impar: " + num);
				pilhaImpar.empilha(num);

			}

		}

		System.out.println("Desempilhando números da pilha impar.");

		while (!pilhaImpar.estaVazia()) {

			System.out.println("Desempilhando um elemento da pilha Impar " + pilhaImpar.desempilha());
		}

		System.out.println("Desempilhando números da pilha par.");

		while (!pilhaPar.estaVazia()) {

			System.out.println("Desempilhando um elemento da pilha Par " + pilhaPar.desempilha());

		}

		System.out.println("Todos os elementos foram desempilhados.");

		scanner.close();

	}

}
