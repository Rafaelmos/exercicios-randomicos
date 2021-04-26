import java.util.ArrayList;
import java.util.Scanner;

public class Robot {

	private String nome;
	private String direcao;
	private static ArrayList<Integer> posicao = new ArrayList<Integer>(2);

	public Robot(String nome, String direcao, ArrayList<Integer> posicao) {
		super();
		this.nome = nome;
		this.direcao = direcao;
		Robot.setPosicao(posicao);
	}

	public void iniciarRobot() {
		if (getPosicao().size() == 0) {
			getPosicao().add(0);
			getPosicao().add(0);
		}
		getPosicao().set(0, 0);
		getPosicao().set(1, 0);
		System.out.println(nome + " iniciou");
	}

	public void statusRobot() {
		System.out.println(
				"A posição atual do " + nome + " é: (" + getPosicao().get(0) + "," + getPosicao().get(1) + ")");
		System.out.println("A direção atual do " + nome + " é: " + direcao);
	}

	public void andarUmPasso() {
		if (direcao == "Norte") {
			getPosicao().set(1, getPosicao().get(1) + 1);
		} else if (direcao == "Sul") {
			getPosicao().set(1, getPosicao().get(1) - 1);
		} else if (direcao == "Leste") {
			getPosicao().set(0, getPosicao().get(0) + 1);
		} else if (direcao == "Oeste") {
			getPosicao().set(0, getPosicao().get(0) - 1);
		}
		System.out.println("O " + nome + " andou 1 passo.");
	}

	public void andarVariosPasso(int andar) {
		if (direcao == "Norte") {
			getPosicao().set(1, getPosicao().get(1) + andar);
		} else if (direcao == "Sul") {
			getPosicao().set(1, getPosicao().get(1) - andar);
		} else if (direcao == "Leste") {
			getPosicao().set(0, getPosicao().get(0) + andar);
		} else if (direcao == "Oeste") {
			getPosicao().set(0, getPosicao().get(0) - andar);
		}
		System.out.println("O " + nome + " andou " + andar + " passos.");
	}

	public void mudarPosicao(int x, int y) {
		getPosicao().set(0, x);
		getPosicao().set(1, y);
		System.out.println("A nova posição é: (" + getPosicao().get(0) + "," + getPosicao().get(1) + ")");
	}

	@SuppressWarnings("resource")
	public void mudarDirecao() {
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("ESCOLHA A NOVA DIREÇÃO\n[0] = Norte  [1] = Sul\n[2] = Leste  [3] = Oeste");
			System.out.print("OPÇÃO: ");
			int opcao = input.nextInt();
			if (opcao == 0) {
				direcao = "Norte";
				break;
			} else if (opcao == 1) {
				direcao = "Sul";
				break;
			} else if (opcao == 2) {
				direcao = "Leste";
				break;
			} else if (opcao == 3) {
				direcao = "Oeste";
				break;
			} else {
				System.out.println("OPÇÃO INVALIDA, ESCOLHA UMA OPÇÃO CORRETA");
			}
		}
	}

	public void retornaPosZero() {
		direcao = "Norte";
		getPosicao().set(0, 0);
		getPosicao().set(1, 0);
	}

	public static ArrayList<Integer> getPosicao() {
		return posicao;
	}

	public static void setPosicao(ArrayList<Integer> posicao) {
		Robot.posicao = posicao;
	}
}