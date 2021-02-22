package com.estudo.estruturadados.exercicios;

public class PositivoMaisProximoZero {

	public static void main(String[] args) {

		int[] numeros = { 5, 22, -9, 8, -3, 10, 2, 6 };

		System.out.println(getNumberPositiveNextZero(numeros));

	}

	public static int getNumberPositiveNextZero(int[] numeros) {
		int numberNext = 0;

		for (int i = 0; i < numeros.length; i++) {
			int number = numeros[i];

			if (isNumberPair(number)) {

				if (isNumberEqualZero(number)) {
					return number;

				} else if (isNumberNextThanZero(numberNext, number)) {
					numberNext = number;

				}

			}

		}

		return numberNext;

	}

	private static boolean isNumberNextThanZero(int numberNext, int number) {
		return isNumberEqualZero(numberNext) || numberNext > number;
	}

	private static boolean isNumberEqualZero(int number) {
		return number == 0;
	}

	private static boolean isNumberPair(int number) {
		return number % 2 == 0;
	}

}
