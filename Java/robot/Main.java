import java.util.ArrayList;

public class Main extends Robot{
	
	private Main(String nome, String direcao, ArrayList<Integer> posicao) {
		super(nome, direcao, posicao);
	}

	public static void main(String[] args) {
		Robot robot = new Robot("Robertinho", "Norte", getPosicao());
		
		robot.iniciarRobot();
		
		//robot.andarVariosPasso(5);
		
		//robot.mudarPosicao(2,5);
		
		/**SOBRE AS DIREÇÕES:
		 * DIREÇÃO NORTE É NA COORNEADA Y CAMINHA EM SENTIDO POSITIVO.
		 * DIREÇÃO SUL	 É NA COORNEADA Y CAMINHA EM SENTIDO NEGATIVO.
		 * DIREÇÃO LESTE É NA COORNEADA X CAMINHA EM SENTIDO POSITIVO.
		 * DIREÇÃO OESTE É NA COORNEADA X CAMINHA EM SENTIDO NEGATIVO.
		 * @author Rafael_Moura
		 */
		
		//robot.mudarDirecao();
		
		//robot.andarUmPasso();

		//robot.statusRobot();
		
		//robot.retornaPosZero();
		
		//robot.statusRobot();

	}
	
	
}