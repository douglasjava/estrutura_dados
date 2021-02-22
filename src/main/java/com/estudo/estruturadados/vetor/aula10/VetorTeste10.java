package com.estudo.estruturadados.vetor.aula10;

import com.estudo.estruturadados.vetor.Contato;
import com.estudo.estruturadados.vetor.VetorObject;

public class VetorTeste10 {

	public static void main(String[] args) {

		try {

			VetorObject vetor = new VetorObject(10);

			Contato c1 = new Contato("Contato1", "1263-0456", "contato1@gmail.com");
			Contato c2 = new Contato("Contato2", "0350-6621", "contato2@gmail.com");
			Contato c3 = new Contato("Contato3", "1159-3896", "contato3@gmail.com");
			Contato c4 = new Contato("Contato3", "1159-3896", "contato3@gmail.com");

			vetor.adiciona1(c1);
			vetor.adiciona1(c2);
			vetor.adiciona1(c3);

			System.out.println(String.format("Tamanho: %d", vetor.tamanho()));
			System.out.println(vetor);

			// O objeto c4 é igual somente, quando é implementado o [equals] da classe
			// Object na classe pois lá é feito a verificação
			// ocupam o mesmo lugar, por isso é encontrado
			int posicao = vetor.buscaPosicao(c4);

			if (posicao > -1) {
				System.out.println("Elemento existe no vetor");
			} else {
				System.err.println("Elemento não existe no vetor");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());

		}

	}
}
