package Q3Pilha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		PilhaServico pilha = new PilhaServico();
		int opcao;

		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Inserir serviço");
			System.out.println("2 - Obter próximo serviço");
			System.out.println("3 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o serviço: ");
				String servico = scanner.nextLine();
				pilha.inserir(servico);
				break;
			case 2:
				pilha.obterProximoServico();
				break;
			case 3:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 3);
	}
}
