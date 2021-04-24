package II_exercicio_7;

public class Livro {
	private int id;

	private String titulo;

	private int ano;

	private String isbn;

	private Autor autor;

	private Editora editora;

	//private Emprestimo empretismo;
	
	public Livro(int id, String titulo, int ano, String isbn, Autor autor, Editora editora) {
		this.setId(id);
		this.setTitulo(titulo);
		this.setAno(ano);
		this.setIsbn(isbn);
		this.setAutor(autor);
		this.setEditora(editora);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
}


