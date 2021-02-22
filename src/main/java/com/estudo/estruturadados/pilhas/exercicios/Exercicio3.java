package com.estudo.estruturadados.pilhas.exercicios;

import com.estudo.estruturadados.pilhas.Pilha;

public class Exercicio3 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<>(20);

		Livro l1 = new Livro("22", "teste", 2016, "O livro 1");
		Livro l2 = new Livro("44", "teste1", 2016, "O livro 2");
		Livro l3 = new Livro("67", "teste2", 2016, "O livro 3");
		Livro l4 = new Livro("98", "teste3", 2016, "O livro 4");

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Empilhando livros na pilha: ");
		
		pilha.empilha(l1);
		pilha.empilha(l2);
		pilha.empilha(l3);
		pilha.empilha(l4);
		
		System.out.println(pilha.tamanho() + " Livros foram empilhados.");
		System.out.println(pilha);

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Espinhando o top da pilha");
		System.out.println(pilha.topo());
		
		System.out.println("Desempilhando livros da pilha: ");
		
		while(!pilha.estaVazia()) {
			
			System.out.println("Desempilhando livro: " + pilha.desempilha());
			
		}
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
	}

}
