package exemplo;

public class Livro {

	private String titulo;
	private String autor;
	private int ano;
	private String isbn;
	private String editora;
	private boolean emprestado;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public Livro(String titulo, String autor, int ano, String isbn, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.isbn = isbn;
		this.editora = editora;
		emprestado = false;
	}

}
