package II_exercicio_4;


public class Bola {
	private String cor;
	private float tamanho;
	private boolean cheia = false;

	public Bola(String cor, float tamanho, boolean cheia) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.cheia = cheia;
	}
	
	public void Status() {
		System.out.println("Cor: " + this.cor + ", tamanho: " + this.tamanho + ", cheia: " + this.cheia);
	}

	public boolean Encher() {
		System.out.println("Bola cheia");
		this.cheia = true;
		return cheia;
	}
	public boolean Esvaziar() {
		System.out.println("Bola esvazia");
		this.cheia = false;
		return cheia;
	}

	public boolean VerCheia() {
		boolean x = this.Encher();
		if (x == false) {
			this.cheia = false;
		} else
			this.cheia = true;
		return this.cheia;
	}

	public boolean VerVazia() {
		boolean x = this.Esvaziar();
		if (x == false) {
			this.cheia = false;
		} else
			this.cheia = true;
		return this.cheia;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getTamanho() { 
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho= tamanho;		
	}
}