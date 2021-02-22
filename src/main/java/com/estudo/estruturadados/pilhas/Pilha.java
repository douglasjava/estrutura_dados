package com.estudo.estruturadados.pilhas;

import com.estudo.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public Pilha() {
		super(10);
	}

	public void empilha(T elemento) {
		super.adiciona(elemento);
	}

	public T topo() {
		return this.estaVazia() ? null : this.elementos[this.tamanho - 1];

	}

	/**
	 * this.elementos[--tamanho]
	 * Primeiro vai ser dimiuido um do tamanho semelhante a this.elementos[tamanho -1]
	 * E feito dentro do [--tamanho] primeiro é dimuido um do tamanho e após recuperar o item da lista
	 * 
	 * @apiNote se o tamnho era 5 -> primeiro vai diminuir o tamanho para 4 e depois vai retornar o elemento da posição 4
	 * como já diminiu um feito a alteração.
	 * @return T
	 */
	public T desempilha() {

		T elemento = topo();
		return elemento != null ? this.elementos[--tamanho] : null;

	}

}
