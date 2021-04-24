package II_exercicio_7;

import II_exercicio_1.Locacao;

public class Usuario {
	private int idUsuario;

	private String nome;

	private String email;

	private String login;

	private String senha;

	private Emprestimo empretismo;
	
	public Usuario(int id, String nome, String email, String login, String senha, Emprestimo emprestimo, int idUsuario) {
		this.idUsuario = idUsuario;
		this.nome= nome;
		this.email= email;
		this.login = login;
		this.senha = senha;
	}

	public Emprestimo realizarEmprestimo(int id, String data,String dataDevolucao, Livro livro, Usuario usuario) {
		Emprestimo emprestimo = new Emprestimo(id, data, dataDevolucao, usuario, livro);
		return empretismo;

	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		senha = senha;
	}

	public Emprestimo getEmpretismo() {
		return empretismo;
	}

	public void setEmpretismo(Emprestimo empretismo) {
		this.empretismo = empretismo;
	}
	
}
