package III_exercicio_4;

public class Main {
	public static void main(String[] args) {
		Cliente zeca = new Cliente("Zeca", "901052300-20", 101, "Corrente", "5555555", "Poupança", (float) 0.40, 900, 1800);
		zeca.verConta();
		zeca.verSaldo();
//		zeca.sacarCorrente();
//		zeca.verSaldo();
//
//		zeca.sacarPoupança();
//		zeca.verSaldo();
//
//		zeca.depositarCorrente();
//		zeca.verSaldo();
//
//		zeca.depositarPoupança();
//		zeca.verSaldo();

		zeca.render();
		zeca.verSaldo();

		
	}
}
