package III_exercicio_3;

public class PessoaRica extends Pessoa{
	private float dinheiro;

	public PessoaRica(String nome,int idade, float dinheiro) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setDinheiro(dinheiro);
	}

	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void fazComprar() {
		System.out.println("COMPROU");
	}
}
