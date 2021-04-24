package III_exercicio_2;

public class Animal {

	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void mover() {
		System.out.println("moveu");
	}
	
	public void emitirSom() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
