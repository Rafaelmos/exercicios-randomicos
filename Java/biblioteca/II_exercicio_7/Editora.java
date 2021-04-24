package II_exercicio_7;

import java.util.Collection;

public class Editora {

	private int id;

	private String nome;

	private Collection<Livro> livro;
	
	
	
	
	

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
