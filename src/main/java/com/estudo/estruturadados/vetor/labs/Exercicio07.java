package com.estudo.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.estudo.estruturadados.vetor.Contato;

public class Exercicio07 {

	public static void main(String[] args) {

		// Criação das variaveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<>(20);

		// criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);

		// criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				opcao01(scan, lista);
				break;
			case 2:
				opcao02(scan, lista);
				break;
			case 3:
				opcao03(scan, lista);
				break;
			case 4:
				opcao04(scan, lista);
				break;
			case 5:
				opcao05(scan, lista);
				break;
			case 6:
				opcao06(scan, lista);
				break;
			case 7:
				opcao07(scan, lista);
				break;
			case 8:
				opcao08(scan, lista);
				break;
			case 9:
				opcao09(lista);
				break;
			case 10:
				opcao10(lista);
				break;
			case 11:
				opcao11(lista);
				break;
			default:
				break;
			}

		}

		System.out.println("Usuário digitou 0, programa encerrado.");
	}

	public static void opcao11(ArrayList<Contato> lista) {
		System.out.println("Vetor: " + lista);
	}

	public static void opcao10(ArrayList<Contato> lista) {
		lista.clear();
		System.err.println("Contatos removidos.");

	}

	public static void opcao09(ArrayList<Contato> lista) {

		System.out.println("Tamanho do vetor é: " + lista.size());

	}

	public static void opcao08(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posição a ser removida.", scan);

		try {

			Contato contato = lista.get(posicao);
			lista.remove(contato);

			System.out.println("Contato excluído.");

		} catch (Exception e) {
			System.out.println("Posição inexistente.");
		}

	}

	public static void opcao07(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posição a ser removida.", scan);

		try {

			lista.remove(posicao);

			System.out.println("Contato excluído.");

		} catch (Exception e) {
			System.out.println("Posição inexistente.");
		}

	}

	public static void opcao06(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {

			Contato contato = lista.get(posicao);

			boolean existe = lista.contains(contato);

			if (existe) {
				System.out.println("Contato existe, segue dados: ");
				System.out.println(contato);

			} else {
				System.out.println("Contato não existe.");
			}

		} catch (Exception e) {
			System.out.println("Posição inexistente.");
		}

	}

	public static void opcao05(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {

			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, segue dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
			posicao = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posicao: " + posicao);

		} catch (Exception e) {
			System.out.println("Posição inexistente.");
		}

	}

	public static void opcao04(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {

			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, segue dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			posicao = lista.indexOf(contato);

			System.out.println("Contato encontrado na posicao: " + posicao);

		} catch (Exception e) {
			System.out.println("Posição inexistente.");
		}

	}

	public static void opcao03(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posição a ser pesquisada.", scan);

		try {

			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, segue dados: ");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inexistente.");
		}

	}

	public static void opcao02(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre com o telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso!!");
		System.out.println(contato);

	}

	public static void opcao01(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre com o telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("Entre com a posição para adicionar o contato", scan);

		try {
			lista.add(posicao, contato);

			System.out.println("Contato adicionado com sucesso!!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inexistente, contato não adicionado");

		}

	}

	public static String lerInformacao(String msg, Scanner scan) {
		System.out.println(msg);
		return scan.nextLine();

	}

	public static int lerInformacaoInt(String msg, Scanner scan) {
		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.err.println("Entrada inválida, digite novamente.");
			}

		}

		return num;

	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entredaValida = false;
		int opcao = 0;
		String entrada = null;

		while (!entredaValida) {

			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma opção específica");
			System.out.println("3: Obter contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índice do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor ");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entredaValida = true;
				} else {
					throw new Exception();

				}

			} catch (Exception e) {
				System.out.println("Favor digitar valores válidos, digite novamente.\n\n");

			}

		}

		return opcao;

	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
		Contato contato = new Contato();
		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("Telefone 111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.add(contato);

		}

	}

}
