package exemploHeranca;

public class Animal {

	private String cor;
	private int tamanho;
	
	public Animal(String c, int t) {
		this.setCor(c);
		this.setTamanho(t);
	} 
	
	public void mover() {
		System.out.println("moveu");
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setTamanho(int t) {
		this.tamanho = t;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
}
