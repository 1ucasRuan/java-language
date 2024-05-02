package arvore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		Arvore arvore = new Arvore();
		No retorno;
		int opcao;
		int valor;

		while (true) {
			System.out.println("Digite 1 para inserir um valor.");
			System.out.println("Digite 2 para pesquisar.");
			System.out.println("Digite 3 para imprimir os valores da Arvore.");
			System.out.println("Digite 4 para sair.");
			System.out.print("Informe sua opção: ");
			opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("\ninforme o valor para ser inserido na Arvore: ");
				valor = input.nextInt();
				input.nextLine();
				arvore.inserir(valor);
				System.out.println("valor inserido com sucesso!!!\n");
				break;
			case 2:
				System.out.print("\nInforme o valor que deseja encontrar na Arvore: ");
				valor = input.nextInt();
				input.nextLine();
				retorno = arvore.pesquisar(valor);
				System.out.println("Valor encontrado: " + retorno + "\n");
				break;
			case 3:
				System.out.println("\nPre-Ordem:");
				arvore.imprimirPreOrdem();
				System.out.println("\n");
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Valor não encontrado. Tente novamente\n");
				break;
			}
		}
	}
}
