package II_exercicio_3;

public class Main {

	public static void main(String[] args) {
		
		Universidade princeton = new Universidade("Princeton");
		Universidade cambridge = new Universidade("Cambridge"); 
		
		Pessoa einstein = new Pessoa(princeton, "Albert Einstein", 14, 3, 1879);
		Pessoa newton = new Pessoa(cambridge, "Isaac Newton", 4, 1, 1643);
		einstein.calcularIdade(17, 12, 2019);
		newton.calcularIdade(17, 12, 2019);
	
		einstein.darCredencial();
		newton.darCredencial();

	
	}
	
}
