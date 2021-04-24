package II_exercicio_7;

import java.util.Collection;

public class Autor {
	public int id;
	private String nome;
	private Collection<Livro> livro;
	
	
	public Autor(int id, String nome, Collection<Livro> livro) {
		this.setId(id);
		this.setNome(nome);
		this.setLivro(livro);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Collection<Livro> getLivro() {
		return livro;
	}
	public void setLivro(Collection<Livro> livro) {
		this.livro = livro;
	}
	
	
}
