package com.estudo.estruturadados.vetor;

import java.lang.reflect.Array;

/**
 * 
 * @author Marques
 *
 * @param <T> -> T de class Type
 */
public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; // Solução do livro effective Java
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClass) {
		this.elementos = (T[]) Array.newInstance(tipoClass, capacidade);
		this.tamanho = 0;
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

	/**
	 * Método ineficiente pois tem que percorrer toda a lista em busca de um espaço
	 * nulo
	 **/
	public void adiciona0(T elemento) {
		aumentaCapacidade();
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}

	}

	/** Método eficiente **/
	public void adiciona1(T elemento) {
		aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new IllegalArgumentException("Vetor já está cheio, não é possivel adiocionar um novo elemento");

		}

	}

	/** Método eficiente **/
	public boolean adiciona2(T elemento) {
		aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}
	
	public T obtem(int posicao) {
		return busca(posicao);
	}

	public T busca(int posicao) {
		posicaoValida(posicao);

		return this.elementos[posicao];
	}

	/**
	 * Algoritimo [Busca sequencial] -> busca por posição
	 * 
	 * @param elemento
	 * @return o elemento
	 */
	public boolean busca(T elemento) {

		for (int i = 0; i < this.tamanho; i++) {

			if (this.elementos[i].equals(elemento)) {
				return true;
			}
		}

		return false;

	}

	/**
	 * Algoritimo [Busca sequencial] -> busca por posição
	 * 
	 * @param elemento
	 * @return a posicao se existir e -1 para a posição inexistente
	 * 
	 */
	public int buscaPosicao(T elemento) {

		for (int i = 0; i < this.tamanho; i++) {

			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;

	}

	/**
	 * Método responsavel por adionar um elemento na posicao passada por parametro
	 * 
	 * @return
	 */
	public boolean adicionarElementoNaPosicao(int posicao, T elemento) {

		posicaoValida(posicao);

		// Mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	/**
	 * Remover um elemento pela posição B G D E F -> posição a ser removida é 1 (G)
	 * 0 1 2 3 4 -> tamanho 5
	 * 
	 * @apiNote O algoritmo vai colocando os valores das posições anteriores até
	 *          chegar na posição a ser removida
	 * @apiNote vetor[1] = vetor[2] = B D D E F
	 * @apiNote vetor[2] = vetor[3] = B D E E F
	 * @apiNote vetor[3] = vetor[4] = B D E F F
	 * 
	 * @param posicao
	 */
	public void removerElementoNaPosicao(int posicao) {

		posicaoValida(posicao);

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		// Removendo do vetor
		this.elementos[this.tamanho - 1] = null;

		// Diminuindo o tamanho do vetor
		this.tamanho--;

	}

	public void remove(T elemento) {

		int posicaoElemento = buscaPosicao(elemento);
		if (posicaoElemento > -1) {
			removerElementoNaPosicao(posicaoElemento);
		}

	}
	

	public void removeAll(T elemento) {
		boolean removeu = false; 
		int posicaoElemento = buscaPosicao(elemento);		
		
		if (posicaoElemento > -1) {
			removerElementoNaPosicao(posicaoElemento);
		}
		
		removeu = posicaoElemento > -1 ? true : false;

		if (removeu) {
			removeAll(elemento);
		}
	}

	private void posicaoValida(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException(String.format("Posicao %d inválida.", posicao));

		}
	}

	/**
	 * É necessario criar um novo array, transferindo as informações atuais para o
	 * novo
	 */
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}

	}

	public boolean contem(T elemento) {
		return buscaPosicao(elemento) > -1;
	}

	/**
	 * Busca a última posição do elemento encontrado na lista fazendo o for
	 * invertido do último para o primeiro
	 * 
	 * @param elemento
	 * @return
	 */
	public int ultimoIndice(T elemento) {

		for (int i = this.tamanho - 1; i >= 0; i--) {

			if (this.elementos[i].equals(elemento)) {
				return i;
			}

		}

		return -1;

	}
	
	/**
	 * A opção 3 seria a mais custosa, porém o fato de ir colocando nulo nos itens irá liberar a memoria
	 * com isso o GB ira passa e limpar esses dados.
	 * 
	 */
	public void clear() {
		//opção 1		
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//opção 2
		//this.tamanho = 0;
		
		//opção 3		
		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}

}
