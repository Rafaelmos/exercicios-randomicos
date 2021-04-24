package II_exercicio_2;

public class Main {

	public static void main(String[] args) {
		
		Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
		Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);
		
		System.out.println(einstein.getIdade());
		System.out.println(newton.getIdade());
		
		einstein.calcularIdade(17, 12, 2019);
		newton.calcularIdade(17, 12, 2019);
	
		System.out.println(einstein.getIdade());
		System.out.println(newton.getIdade());
		
	}
	
}
