package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Title;
import entities.Utilitarios;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Utilitarios utilitarios = new Utilitarios();
		int option;

		System.out.println("### WELCOME TO JAVAFLIX ###");

		do {
			System.out.print(
					"\nMenu: \n[1] Adicionar filme/serie\n[2] Listar filmes\n[3] Listar series\n"
					+ "[4] Busca por titulo\n[5] Busca por genero\n[6] Busca por ano de lancamento\n[7] Sair\n\nDigite a opcao desejada: ");
			option = input.nextInt();
			switch (option) {
			case 1:
				System.out.println("### ADICAO DE FILMES/SERIES ###");
				System.out.print("\nDigite o titulo: ");
				input.nextLine();
				String titulo = input.nextLine();
				System.out.print("Digite o ano de lancamento: ");
				Integer anoLancamento = input.nextInt();
				input.nextLine();
				System.out.print("Digite o genero: ");
				String genero = input.nextLine();
				System.out.print("E um filme ou uma serie? ");
				String tipo = input.nextLine();
				System.out.print("Digite o diretor: ");
				String diretor = input.nextLine();
				System.out.print("Quantos atores/atrizes gostaria de adicionar a tela principal? ");
				int quantidade = input.nextInt();
				input.nextLine();
				List<String> elenco = new ArrayList<>();
				for (int i = 1; i <= quantidade; i++) {
					System.out.printf("\nDigite o %do ator/atriz: ", i);
					String name = input.nextLine();
					elenco.add(name);
				}
				System.out.print("Sinopse: ");
				String sinopse = input.nextLine();
				Title title = new Title(titulo, anoLancamento, genero, tipo, diretor, elenco, sinopse);
				utilitarios.addTitle(title);
				break;
			case 2:
				if (utilitarios.listarFilmes() != null) {
					System.out.println(utilitarios.listarFilmes());
				} else {
					System.out.println("\nNao ha filmes registrados.");
				}
				break;
			case 3:
				if (utilitarios.listarSeries() != null) {
					System.out.println(utilitarios.listarSeries());
				} else {
					System.out.println("\nNao ha series registradas.");
				}
				break;
			case 4:
				input.nextLine();
				System.out.print("Digite o titulo desejado: ");
				String buscaTitulo = input.nextLine();
				if (utilitarios.buscarPorTitulo(buscaTitulo) != null) {
					System.out.println(utilitarios.buscarPorTitulo(buscaTitulo));
				} else {
					System.out.println("\nTitulo nao encontrado!");
				}
				break;
			case 5:
				input.nextLine();
				System.out.print("Digite o genero desejado: ");
				String buscaGenero = input.nextLine();
				if (utilitarios.buscaPorGenero(buscaGenero) != null) {
					System.out.println(utilitarios.buscaPorGenero(buscaGenero));
				} else {
					System.out.println("\nNada encontrado para este genero!");
				}
				break;
			case 6:
				System.out.print("Digite o ano de lancamento com 4 digitos: ");
				int buscaAno = input.nextInt();
				if (utilitarios.buscaPorAno(buscaAno) != null) {
					System.out.println(utilitarios.buscaPorAno(buscaAno));
				} else {
					System.out.println("\nNada encontrado com este ano de lancamento!");
				}
				break;
			case 7:
				System.out.println("Encerrando o programa. Obrigado por usar o JavaFlix!");
				break;
			default:
				System.out.println("Opcao invalida! Tente novamente: ");
				option = input.nextInt();
				break;
			}
			
		} while (option != 7);

		input.close();
	}
}