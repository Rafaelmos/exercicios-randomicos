package III_exercicio_3;

public class PessoaMiseravel extends Pessoa{

	public PessoaMiseravel(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);	
	}
	public void mendiga() {
		System.out.println("MENDIGOU");
	}

}
