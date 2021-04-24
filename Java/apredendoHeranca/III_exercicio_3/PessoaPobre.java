package III_exercicio_3;

public class PessoaPobre extends Pessoa{
	
	public PessoaPobre(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public void trabalha() {
		System.out.println("TRABALHOU");
	} 

}
