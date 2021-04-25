import java.util.ArrayList;

public class Main extends Robot{
	
	public Main(String nome, String direcao, ArrayList<Integer> posicao) {
		super(nome, direcao, posicao);
	}

	public static void main(String[] args) {
		Robot robot = new Robot("Robertinho", "Norte", posicao);
		
		robot.iniciarRobot();
		
		robot.andarVariosPasso(5);
		
		//robot.mudarPosicao();
		
		robot.mudarDirecao();
		
		robot.andarUmPasso();

		robot.statusRobot();
		
		robot.retornaPosZero();
		
		robot.statusRobot();

	}
	
	
}