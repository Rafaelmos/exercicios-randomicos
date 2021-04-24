package exercicio12;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int numAle = random.nextInt(100);
		System.out.println("Digite um número: "); 
		int valor = input.nextInt();
		//System.out.println(numAle);
		
		while (valor != numAle) {
			if (valor > numAle){
				System.out.println("MAIOR");}

			if (valor < numAle) {
				System.out.println("MENOR");}
	
			System.out.println("Digite um número: "); 
			valor = input.nextInt();}
		
		if (valor == numAle) {
			System.out.println("VALOR ENCONTRADO");	}
	}
}


