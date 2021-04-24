package exemploHeranca;

public class Papagaio extends Ave{

	private int idade;
	
	public Papagaio(String cor, int tamanho, int quant, int idade) {
		super(cor, tamanho, quant);
		this.setIdade(idade);
	}
	
	public void falar() {
		System.out.println("Oi!");
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
}
