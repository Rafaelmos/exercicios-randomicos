package exercicio10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a velocidade do carro: ");
		int velocidade = input.nextInt();
		System.out.println("Digite o limite de velocidade da pista: ");
		int limite = input.nextInt();
		
		int ultrapasso = velocidade - limite;
		int multaMenorJuros = ultrapasso * 5;
		int multaBase = 50;
		int multaMenor = multaBase+multaMenorJuros;
		int MultaMaiorJuros = ultrapasso * 10;
		int multaMaior = 200+MultaMaiorJuros;

		
		if (velocidade <= limite) {
			System.out.println("Veículo não multado, velocidade abaixo ou igual o limite");
		}
		if (ultrapasso <= 10 && ultrapasso> 0) {
			System.out.println("Multa de 50,00 R$");
		}
		if (ultrapasso >= 11 && ultrapasso <=30) {
			System.out.println("Multa de " + multaMenor + ",00 R$");
		}
		if (ultrapasso > 30) {
			System.out.println("Multa de " + multaMaior + ",00 R$");		}
	}
}
