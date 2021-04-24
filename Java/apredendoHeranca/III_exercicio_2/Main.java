package III_exercicio_2;

public class Main {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Bichano");
		Cachorro cachorro = new Cachorro("Rex");
		
		Papagaio papagaio = new Papagaio("Louro José");
		Galinha galinha = new Galinha("Galinha Pintadinha");
		
		gato.emitirSom();
		cachorro.emitirSom();
		papagaio.emitirSom();
		galinha.emitirSom();
		
		
		
	}
	
}
