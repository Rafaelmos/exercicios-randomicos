package II_exercicio_1;

public class Socio {

	private String cpf;
	private String nome;
	private String dataDeNascimento;
	private String endereco;
	private String telefone;
	
	public Socio(String cpf, String nome, String dataDeNascimento, String endereco, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Locacao realizarLocacao(DVD dvd, int idLocacao, String dataLocacao, String dataDevolucao) {
		Locacao locacao = new Locacao(dvd, this, idLocacao, dataLocacao, dataDevolucao);
		return locacao;
	}
	
	public void realizarDevolucao(Locacao locacao) {
		locacao.setDevolvido(true);		
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
