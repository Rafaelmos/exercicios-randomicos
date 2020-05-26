package exercicio03;
import java.util.Scanner;

// PRINT A WORD THE QUANTITY OF TIMES REQUESTED.
// IMPRIME UMA PALAVRA A UMA DETERMINADA QUANTIDADE DE VEZES.

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String nome = input.nextLine();
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println(nome);
			
		}
		
	}
	

}
