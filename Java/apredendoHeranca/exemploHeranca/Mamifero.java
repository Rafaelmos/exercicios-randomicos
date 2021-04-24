package exemploHeranca;

public class Mamifero extends Animal{

	public Mamifero(String cor, int tamanho) {
		super(cor, tamanho);
	}
	
	public void mover() {
		System.out.println("andou");
	}
	
}
