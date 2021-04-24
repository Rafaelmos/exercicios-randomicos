package II_exercicio_3;

public class Pessoa {

	private Universidade universidade;
	private String nome;
	private int idade;
	private int diaDeNascimento;
	private int mesDeNascimento;
	private int anoDeNascimento;

	public Pessoa(Universidade universidade, String nome, int diaDeNascimento, int mesDeNascimento, int anoDeNascimento) {
		this.universidade = universidade;
		this.nome = nome;
		this.diaDeNascimento = diaDeNascimento;
		this.mesDeNascimento = mesDeNascimento;
		this.anoDeNascimento = anoDeNascimento;
	}

	public void darCredencial() {
		System.out.println("Meu nome é:" + this.nome + " e trabalho em " + this.universidade.getNome());
	}

	public void calcularIdade(int diaAtual, int mesAtual, int anoAtual) {

		if (mesAtual > this.mesDeNascimento) {

			this.idade = anoAtual - this.anoDeNascimento;

		} else if (mesAtual == this.mesDeNascimento) {

			if (diaAtual >= this.diaDeNascimento) {
				this.idade = anoAtual - this.anoDeNascimento;
			} else {
				this.idade = anoAtual - this.anoDeNascimento - 1;
			}

		} else {
			this.idade = anoAtual - this.anoDeNascimento - 1;
		}

	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDiaDeNascimento() {
		return diaDeNascimento;
	}
	public void setDiaDeNascimento(int diaDeNascimento) {
		this.diaDeNascimento = diaDeNascimento;
	}
	public int getMesDeNascimento() {
		return mesDeNascimento;
	}
	public void setMesDeNascimento(int mesDeNascimento) {
		this.mesDeNascimento = mesDeNascimento;
	}
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public int getIdade() {
		return idade;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}



}
