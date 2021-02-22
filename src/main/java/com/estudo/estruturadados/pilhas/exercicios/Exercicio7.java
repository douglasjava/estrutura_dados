package com.estudo.estruturadados.pilhas.exercicios;

import java.util.Stack;

/**
 * Conversão de Decimal para Binario <b>Explicação:</b>
 * <p>
 * Para converter um decimal para binário é necessário dividir o valor por 2(BI
 * nario) e ir divindo até não ser possivel mais, o valor investido (de trás
 * para frente) do resto será o valor binario do valor em questão
 * <p>
 * 
 * <b>Exemplo</b>
 * <p>
 * 
 * 25 / 2 = 12 Resto: 1
 * <p>
 * 12 / 2 = 6 Resto: 0
 * <p>
 * 6 / 2 = 3 Resto: 0
 * <p>
 * 3 / 2 = 1 Resto: 1
 * <p>
 * 1 / 2 = 0 Resto: 1 <b>Começar daqui</b>
 * <p>
 * 
 * <b>Resultado: 1 1 0 0 1</b>
 * 
 * @author Marques
 *
 */
public class Exercicio7 {

	public static void main(String[] args) {

		imprimeResultado(2);

		imprimeResultado(4);

		imprimeResultado(10);

		imprimeResultado(25);

		imprimeResultado(10035);
		
		imprimeResultadoQualquerBase(25, 16);
		
		imprimeResultadoQualquerBase(10035, 8);
		
		imprimeResultadoQualquerBase(10035, 16);
		
		imprimeResultadoQualquerBase(10035, 20);

	}

	public static void imprimeResultado(int numero) {
		System.out.println(numero + " o valor binario é? " + decimalBinario(numero));
	}
	
	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " + base + " é " + decimalParaQualquerBase(numero, base));
	}

	public static String decimalBinario(int numero) {

		Stack<Integer> stack = new Stack<>();
		String numeroBinario = "";
		int resto;

		while (numero > 0) {
			resto = numero % 2;
			stack.push(resto);

			numero /= 2;

		}

		while (!stack.isEmpty()) {
			numeroBinario += stack.pop();
		}

		return numeroBinario;
	}

	public static String decimalParaQualquerBase(int numero, int base) {
		
		if(base > 16) {
			throw new IllegalArgumentException("Algoritmo suporta apenas até a base 16");
		}

		Stack<Integer> stack = new Stack<>();
		String numeroBinario = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0) {
			resto = numero % base;
			stack.push(resto);

			numero /= base;

		}

		while (!stack.isEmpty()) {
			numeroBinario += bases.charAt(stack.pop());
		}

		return numeroBinario;
	}

}
