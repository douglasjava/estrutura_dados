package com.estudo.estruturadados.vetor;

public class VetorObject {

	private Object[] elementos;
	private int tamanho;

	public VetorObject(int capacidade) {
		this.elementos = new Object[capacidade];
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
	public void adiciona0(Object elemento) {
		aumentaCapacidade();
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}

	}

	/** Método eficiente **/
	public void adiciona1(Object elemento) {
		aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new IllegalArgumentException("Vetor já está cheio, não é possivel adiocionar um novo elemento");

		}

	}

	/** Método eficiente **/
	public boolean adiciona2(Object elemento) {
		aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}

	public Object busca(int posicao) {
		posicaoValida(posicao);

		return this.elementos[posicao];
	}

	/**
	 * Algoritimo [Busca sequencial] -> busca por posição
	 * 
	 * @param elemento
	 * @return o elemento
	 */
	public boolean busca(Object elemento) {

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
	public int buscaPosicao(Object elemento) {

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
	public boolean adicionarElementoNaPosicao(int posicao, Object elemento) {

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
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}

	}
	
}
