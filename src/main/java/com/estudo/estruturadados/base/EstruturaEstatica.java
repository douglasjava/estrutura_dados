package com.estudo.estruturadados.base;

@SuppressWarnings("unchecked")
public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; // Solução do livro effective Java
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	protected boolean adiciona(T elemento) {
		aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}

	/**
	 * Método responsavel por adionar um elemento na posicao passada por parametro
	 * 
	 * @return
	 */
	protected boolean adiciona(int posicao, T elemento){

		if (posicao < 0 || posicao > tamanho){
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();

		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			sb.append(this.elementos[i]);
			sb.append(", ");
		}

		if (this.tamanho > 0) {
			sb.append(this.elementos[this.tamanho - 1]);
		}

		sb.append("]");

		return sb.toString();
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	/**
	 * É necessario criar um novo array, transferindo as informações atuais para o
	 * novo
	 */
	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}

	}

	private void posicaoValida(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException(String.format("Posicao %d inválida.", posicao));

		}
	}

	
	protected void removerElementoNaPosicao(int posicao) {

		posicaoValida(posicao);

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		// Removendo do vetor
		this.elementos[this.tamanho - 1] = null;

		// Diminuindo o tamanho do vetor
		this.tamanho--;

	}

	
}
