package II_exercicio_5;

public class Elevador {
	private int andarAtual;
	private int ocupacao;
	private int totalDeAndares;
	private int capacidadeTotal;


	public Elevador(int andarAtual, int totalDeAndares, int capacidadeTotal, int ocupacao) {
		this.andarAtual = andarAtual;
		this.totalDeAndares = totalDeAndares;
		this.capacidadeTotal = capacidadeTotal;
		this.ocupacao = ocupacao;
	}
	public void Status() {
		System.out.println("O andar atual é: " + this.andarAtual);
		System.out.println("O maximo de andares é " + this.totalDeAndares);
		System.out.println("Há " + this.ocupacao + " ocupando o elevandor");
		System.out.println("O elevador tem capacidade de " + this.capacidadeTotal + " pessoas");
	}

	public void Inicializar(int totalDeAndares, int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
		this.totalDeAndares = totalDeAndares;
		this.ocupacao = 0;
		this.andarAtual = 0;		
	}
	public void Entrar() {
		if (this.ocupacao < this.capacidadeTotal) {
			this.ocupacao += 1;
			//System.out.println("PESSOA ENTROU");

		} if (this.ocupacao >= this.capacidadeTotal) {
			System.out.println("ELEVADOR LOTADO");	

		}
	}
	public void Sair() {
		if (this.ocupacao > 1) {
			this.ocupacao -= 1;
			//System.out.println("PESSOA SAIU");

		} else {
			System.out.println("NÃO HÁ PESSOAS PARA SAIR");

		}
	}
	public void Subir() {
		if (this.andarAtual < this.totalDeAndares) {
			this.andarAtual +=1;
			System.out.println("IMPOSSÍVEL SUBIR");
			//System.out.println("SUBIMOS UM ANDAR");

		} if (this.andarAtual >= this.totalDeAndares) {
		}
	}
	public void Descer() {
		if (this.andarAtual > 0) {
			this.andarAtual -=1;
			//System.out.println("DESCEMOS UM ANDAR");
		} else {
			System.out.println("IMPOSSÍVEL DESCER, ESTAMOS NO ANDAR BASE");

		}
	}




	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalDeAndares() {
		return totalDeAndares;
	}
	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}
	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}
	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}
	public int getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(int ocupacao) {
		this.ocupacao = ocupacao;
	}









}
