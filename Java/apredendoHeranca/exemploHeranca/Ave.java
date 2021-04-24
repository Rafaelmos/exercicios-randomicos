package exemploHeranca;

public class Ave extends Animal{

	private int quantPenas;
	
	public Ave(String cor, int tamanho, int quant) {
		super(cor, tamanho);
		this.setQuantPenas(quant);
	}
	
	public void mover() {
		System.out.println("voou");
	}
	
	public void setQuantPenas(int quant) {
		this.quantPenas = quant;
	}
	
	public int getQuantPenas() {
		return this.quantPenas;
	}
	
}
