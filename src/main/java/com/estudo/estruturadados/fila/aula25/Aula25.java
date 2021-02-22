package com.estudo.estruturadados.fila.aula25;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.estudo.estruturadados.fila.Paciente;

public class Aula25 {

	public static void main(String[] args) {

		/** Primeira opção
		Queue<Paciente> filaComPrioridade = new PriorityQueue<>(new Comparator<Paciente>() {
			public int compare(Paciente p1, Paciente p2) {				
				if (p1.getPrioridade() > p2.getPrioridade()) {
					return 1;

				} else if (p1.getPrioridade() < p2.getPrioridade()) {
					return -1;

				}
				return 0;
			};
		});
		**/
		
		/** Segunda opção
		Queue<Paciente> filaComPrioridade = new PriorityQueue<>(new Comparator<Paciente>() {
			public int compare(Paciente p1, Paciente p2) {				
				return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
			};
		});
		***/
		
		/** Versão com lambda **/
		Queue<Paciente> filaComPrioridade = new PriorityQueue<>((p1,p2) -> Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade()));
		
		

		filaComPrioridade.add(new Paciente("A", 2));
		filaComPrioridade.add(new Paciente("A", 1));
		filaComPrioridade.add(new Paciente("A", 6));

		System.out.println(filaComPrioridade);
	}

}
