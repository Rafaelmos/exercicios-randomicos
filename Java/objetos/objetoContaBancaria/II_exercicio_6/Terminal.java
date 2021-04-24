package II_exercicio_6;

public class Terminal {
	public static void main(String[] args) {
		Cliente roldofo = new Cliente("Rodolfo", "046444261-20");
		Conta roldofo_conta = new Conta("Brasil", 41151, 500);
		
		roldofo_conta.Depositar();
		roldofo_conta.Sacar();
	}
}
