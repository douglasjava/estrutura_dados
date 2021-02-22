package com.estudo.estruturadados.pilhas.exercicios;

import java.util.Stack;

public class Exercicio4 {

	public static void main(String[] args) {

		Stack<Livro> pilha = new Stack<>();

		Livro l1 = new Livro("22", "teste", 2016, "O livro 1");
		Livro l2 = new Livro("44", "teste1", 2016, "O livro 2");
		Livro l3 = new Livro("67", "teste2", 2016, "O livro 3");
		Livro l4 = new Livro("98", "teste3", 2016, "O livro 4");

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

		System.out.println("Empilhando livros na pilha: ");

		pilha.push(l1);
		pilha.push(l2);
		pilha.push(l3);
		pilha.push(l4);

		System.out.println(pilha.size() + " Livros foram empilhados.");
		System.out.println(pilha);

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

		System.out.println("Espinhando o top da pilha");
		System.out.println(pilha.peek());

		System.out.println("Desempilhando livros da pilha: ");

		while (!pilha.isEmpty()) {

			System.out.println("Desempilhando livro: " + pilha.pop());

		}

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
	}

}
