package com.estudo.estruturadados.fila.aula24;

import com.estudo.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {

		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

		fila.enfileira(10);
		fila.enfileira(3);
		fila.enfileira(2);
		fila.enfileira(1);
		fila.enfileira(0);

		System.out.println(fila);

	}

}
