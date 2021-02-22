package com.estudo.estruturadados.fila;

import com.estudo.estruturadados.base.EstruturaEstatica;

/***
 * Segue o padrão <b>FIFO</b> First In First Out
 * <p>
 * 
 * Primeiro a entrar, primeiro a sair
 * 
 * @author Marques
 *
 * @param <T>
 */
public class Fila<T> extends EstruturaEstatica<T> {

	public Fila(int capacidade) {
		super(capacidade);
	}

	public Fila() {
		super();
	}

	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}

	public T espiar() {
		if(this.elementos != null) {
			return this.elementos[0];			
		}
		return null;
	}

	public T desenfileira() {

		final int POS = 0;

		if (this.estaVazia()) {
			return null;
		}

		T elementoASerRemovido = this.elementos[POS];

		this.removerElementoNaPosicao(POS);

		return elementoASerRemovido;
	}

	public boolean estaVazia() {
		return super.estaVazia();
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		return super.toString();
	}

}
