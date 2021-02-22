package com.estudo.estruturadados.vetor;

import com.estudo.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

	public Lista2() {
		super();
	}

	public Lista2(int capacidade) {
		super(capacidade);
	}

	@Override
	protected boolean adiciona(int posicao, T elemento) {
		return super.adiciona(posicao, elemento);
	}

	@Override
	protected boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int tamanho() {
		return super.tamanho();
	}

}
