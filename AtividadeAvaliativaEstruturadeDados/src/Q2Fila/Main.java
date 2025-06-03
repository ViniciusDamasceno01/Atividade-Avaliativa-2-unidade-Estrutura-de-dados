package Q2Fila;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		FilaEntrevista fila = new FilaEntrevista();
		int opcao;

		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Inserir Entrevistado");
			System.out.println("2 - Próximo Entrevistado");
			System.out.println("3 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do entrevistado: ");
				String nome = scanner.nextLine();
				fila.inserir(nome);
				break;
			case 2:
				fila.proximoEntrevistado();
				break;
			case 3:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 3);
	}
}
