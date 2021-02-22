package com.estudo.estruturadados.pilhas.exercicios;

import com.estudo.estruturadados.pilhas.Pilha;

public class Exercicio6 {

	final static String ABRE = "({[";
	final static String FECHA = ")}]";

	public static void main(String[] args) {

		imprimeResultado("A + B");
		
		imprimeResultado("A + B + (C - D)");
		
		imprimeResultado("A + B + (C - D) + [X + P]");
		
		imprimeResultado("A + B + (C - D}");
		
		imprimeResultado("A + B + {C - D}");
	}
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está balanceada? " + verificaSimbolosBalanceados(expressao));
	}

	public static boolean verificaSimbolosBalanceados(String expressao) {

		char simbolo, topo;

		Pilha<Character> pilha = new Pilha<>();

		int idx = 0;
		while (idx < expressao.length()) {
			simbolo = expressao.charAt(idx);

			if (ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);

			} else if (FECHA.indexOf(simbolo) > -1) {

				if (pilha.estaVazia()) {
					return false;

				} else {
					topo = pilha.desempilha();

					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}

				}

			}

			idx++;

		}

		return true;
	}

}
