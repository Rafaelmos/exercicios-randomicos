package verficarAnoBissexto;
import java.util.*;

//CHECK IF THE YEAR IS BISEXT OR NOT.
//VERIFICA SE O ANO É BISSEXTO OU NÃO �.

public class VerficarAnoBissexto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ano: ");
		int ano = input.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
		
			System.out.println("O Ano " + ano + " é bissexto");

}
		else {
			System.out.println("O Ano não é bissexto");

		}

}}
