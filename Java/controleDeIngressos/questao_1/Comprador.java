package questao_1;

import java.util.Random;

public class Comprador {
	private String nome;
	private String cpf;
	private String dataDeNascimento;
	private String login;
	private String senha;
	
	
	public Comprador(String nome, String cpf, String dataDeNascimento, String login, String senha) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataDeNascimento(dataDeNascimento);
		this.setLogin(login);
		this.setSenha(senha);
		
		
	}
	
	public void comprarIngresso(){
		System.out.println("Compra efetuada");
		Ingressos ingresso01 = new Ingressos(0, "20/12/2019", "31/12/2019", "Festa de Ano novo", "Centro da Cidade");
		ingresso01.emitirIngresso();
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
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
		this.senha = senha;
	}
	
	
	
}
