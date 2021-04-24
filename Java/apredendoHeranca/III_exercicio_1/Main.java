package III_exercicio_1;

public class Main {

	public static void main(String[] args) {

		Gato gato = new Gato("Bichano");
		Cachorro cachorro = new Cachorro("Rex");

		gato.mia();
		cachorro.late();

		gato.mover();
		cachorro.mover();

	}

}
