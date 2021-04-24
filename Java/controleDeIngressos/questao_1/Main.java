package questao_1;

public class Main {
	public static void main(String[] args) {
		Comprador comprador = new Comprador("Rafael", "444.555.557-20", "19/08/2000", "login01", "*******");	
		int i=0;
		while (i<=20) {
			comprador.comprarIngresso();
			i+=1;
		}
		
		
	}
	
}
