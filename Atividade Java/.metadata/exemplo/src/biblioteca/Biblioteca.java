package biblioteca;

public class Biblioteca {

	int i, p;

	Livro[] biblioteca = new Livro[100];

	public void iniciarVetor() {

		for (i = 0; i < 100; i++) {
			biblioteca[i] = null;
		}
	}

	public void cadastrarLivro(String titulo, String autor, int ano, String isbn, String editora) {
		for (i = 0; i < 100; i++) {
			if (biblioteca[i] == null) {
				biblioteca[i] = new Livro(titulo, autor, ano, isbn, editora);
				System.out.println("Livro cadastrado com sucesso!");
				System.out.println("");
				return;
			}
		}
		System.out.println("Biblioteca cheia.");
	}

	public void remover(int indice) {

		for (i = 0; i < 100; i++) {
			if (biblioteca[i] != null && biblioteca[i].isEmprestado() == false) {
				biblioteca[indice] = null;
				System.out.println("");
				System.out.println("Livro removido com sucesso!");
				System.out.println("");
				return;
			} else {
				if (biblioteca[i] != null && biblioteca[i].isEmprestado() == true) {
					System.out.println("");
					System.out.println("Devolver livro antes de remover");
					System.out.println("");

				}
			}

		}

	}

	public void emprestar(int indice) {
		if (biblioteca[indice] == null) {
			System.out.println("");
			System.out.println("Posição incorreta.");
			System.out.println("");
			return;
		} else if (biblioteca[indice].isEmprestado() == true) {
			System.out.println("");
			System.out.println("O livro não pode ser emprestado.");
			System.out.println("");
			return;
		} else {
			biblioteca[indice].setEmprestado(true);
			System.out.println("");
			System.out.println("Livro emprestado com sucesso.");
			System.out.println("");
			return;
		}
	}

	public void devolver(int indice) {
		if (biblioteca[indice] == null) {
			System.out.println("");
			System.out.println("Informe a posição correta para devolver o livro!");
			System.out.println("");
			return;
		} else {
			biblioteca[indice].setEmprestado(false);
			System.out.println("");
			System.out.println("Livro devolvido com sucesso.");
			System.out.println("");
			return;
		}

	}

	public void listarLivro(boolean emprestado) {
		for (i = 0; i < 100; i++) {
			if (biblioteca[i] != null && biblioteca[i].isEmprestado() == emprestado) {
				System.out.println("Indice: " + i);
				System.out.println("Titulo: " + biblioteca[i].getTitulo());
				System.out.println("Autor: " + biblioteca[i].getAutor());
				System.out.println("ISBN: " + biblioteca[i].getIsbn());
				System.out.println("Editora: " + biblioteca[i].getEditora());
				System.out.println("");

			}
		}
	}

}
