package III_exercicio_3;

public class Main {
	public static void main(String[] args) {
		
	
	PessoaRica rica = new PessoaRica("Albert", 38, 900000);
	PessoaPobre pobre = new PessoaPobre("Jorge", 35);
	PessoaMiseravel miseravel = new PessoaMiseravel("Josué", 39);
	
	rica.fazComprar();
	pobre.trabalha();
	miseravel.mendiga();
	
	
}
}