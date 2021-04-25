import java.util.ArrayList;
import java.util.Scanner;

public class Robot {

	public String nome;
	public String direcao;
    public static ArrayList<Integer> posicao = new ArrayList<Integer>(2);

	public Robot(String nome, String direcao, ArrayList<Integer> posicao) {
		super();
		this.nome = nome;
		this.direcao = direcao;
		Robot.posicao = posicao;
	}
	
	public void iniciarRobot() {
		if (posicao.size()==0) {
			posicao.add(0);
			posicao.add(0);
		}
		posicao.set(0, 0);
		posicao.set(1, 0);
		System.out.println(nome + " iniciou");
	}
	
	public void statusRobot() {
		System.out.println("A posi��o atual do "+nome+" �: ("+posicao.get(0)+"," +posicao.get(1)+")");
		System.out.println("A dire��o atual do "+nome+" �: "+direcao);
	}
	
	public void andarUmPasso() {
		if (direcao == "Norte") {
			posicao.set(1, posicao.get(1)+1);
		} else if (direcao == "Sul") {
			posicao.set(1, posicao.get(1)-1);
		} else if (direcao == "Leste") {
			posicao.set(0, posicao.get(0)+1);
		} else if (direcao == "Oeste") {
			posicao.set(0, posicao.get(0)-1);	
		}
		System.out.println("O "+nome+" andou 1 passo.");	
	}
	
	public void andarVariosPasso(int andar) {
		if (direcao == "Norte") {
			posicao.set(1, posicao.get(1)+andar);
		} else if (direcao == "Sul") {
			posicao.set(1, posicao.get(1)-andar);
		} else if (direcao == "Leste") {
			posicao.set(0, posicao.get(0)+andar);
		} else if (direcao == "Oeste") {
			posicao.set(0, posicao.get(0)-andar);	
		}
		System.out.println("O "+nome+" andou "+andar+" passos.");
	}
	
	public void mudarPosicao(int x, int y) {
		posicao.set(0, x);
		posicao.set(1, y);
		System.out.println("A nova posi��o �: ("+posicao.get(0)+","+posicao.get(1)+")");
	}
	
	@SuppressWarnings("resource")
	public void mudarDirecao() {
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("ESCOLHA A NOVA DIRE��O\n[0] = Norte  [1] = Sul\n[2] = Leste  [3] = Oeste");
			System.out.print("OP��O: ");
			int opcao = input.nextInt();
			if (opcao==0) {
				direcao = "Norte";
				break;
			} else if (opcao==1) {
				direcao = "Sul";
				break;
			} else if(opcao==2) {
				direcao = "Leste";
				break;
			} else if (opcao==3) {
				direcao = "Oeste";
				break;
			} else {
				System.out.println("OP��O INVALIDA, ESCOLHA UMA OP��O CORRETA");
			}		
		}
	}
	
	public void retornaPosZero() {
		direcao = "Norte";
		posicao.set(0, 0);
		posicao.set(1, 0);
	}
   
	
	
	
	
}
