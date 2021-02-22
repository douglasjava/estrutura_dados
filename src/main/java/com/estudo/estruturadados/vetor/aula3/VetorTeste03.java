package com.estudo.estruturadados.vetor.aula3;

import com.estudo.estruturadados.vetor.Vetor;

public class VetorTeste03 {

	public static void main(String[] args) {

		try {

			Vetor vetor = new Vetor(5);
			vetor.adiciona2("elemento 1");
			vetor.adiciona2("elemento 1");
			vetor.adiciona2("elemento 1");
			vetor.adiciona2("elemento 1");
			vetor.adiciona2("elemento 1");
			vetor.adiciona2("elemento 1");
			System.out.println(vetor);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
