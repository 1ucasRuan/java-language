package biblioteca;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();

		String titulo, autor, isbn, editora;
		int ano, opcao, indice, executando = 1;

		while (executando == 1) {
			System.out.println("1 - Cadastrar livro.");
			System.out.println("2 - Remover livro");
			System.out.println("3 - Emprestar livro.");
			System.out.println("4 - Devolver livro");
			System.out.println("5 - Lista livros disponiveis.");
			System.out.println("6 - Listar livros emprestados");
			System.out.println("7 - Sair.");
			System.out.println("");
			System.out.print("Insira sua opção: ");
			opcao = input.nextInt();
			input.nextLine();
			System.out.println("");

			switch (opcao) {

			case 1:
				System.out.print("Titulo: ");
				titulo = input.nextLine();
				System.out.print("Autor: ");
				autor = input.nextLine();
				System.out.print("Ano: ");
				ano = input.nextInt();
				input.nextLine();
				System.out.print("ISBN: ");
				isbn = input.nextLine();
				System.out.print("Editora: ");
				editora = input.nextLine();
				System.out.println("");

				biblioteca.cadastrarLivro(titulo, autor, ano, isbn, editora);
				break;

			case 2:
				System.out.print("Informe o indice que deseja remover o livro: ");
				indice = input.nextInt();
				input.nextLine();
				biblioteca.remover(indice);
				break;

			case 3:
				System.out.print("Informe o indice do livro que deseja emprestar: ");
				indice = input.nextInt();
				input.nextLine();
				biblioteca.emprestar(indice);
				break;

			case 4:
				System.out.print("Informe o indice que deseja devolver o livro: ");
				indice = input.nextInt();
				input.nextLine();
				biblioteca.devolver(indice);
				break;

			case 5:
				biblioteca.listarLivro(false);
				break;

			case 6:
				biblioteca.listarLivro(true);
				break;

			case 7:
				executando = 0;
				break;

			default:
				System.out.println("Opção não encontrada!");
				System.out.println("");
				break;
			}

		}
	}
}
