package exemploHeranca;

public class Main {

	public static void main(String[] args) {
		
		Ave ave = new Ave("vermelha", 10, 100);
		
		Anfibio anfibio = new Anfibio("laranja", 5);
		
		Mamifero mamifero = new Mamifero("marrom", 20);
		
		ave.mover();
		anfibio.mover();
		mamifero.mover();
		
		Papagaio papagaio = new Papagaio("verde", 10, 100, 25);
		
		papagaio.mover();
		papagaio.falar();
		
		System.out.println(papagaio.getCor());
		
		
	}
	
}
