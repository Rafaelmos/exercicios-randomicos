package III_exercicio_1;

public class Animal {

	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void mover() {
		System.out.println("moveu");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
