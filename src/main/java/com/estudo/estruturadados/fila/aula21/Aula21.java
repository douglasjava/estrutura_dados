package com.estudo.estruturadados.fila.aula21;

import com.estudo.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		fila.enfileira(9);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila.espiar());

	}

}
