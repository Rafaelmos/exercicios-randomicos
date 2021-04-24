package comerfruta;

public class Main {
	public static void main(String[] args) {
		
		
		Fruta fruta = new Fruta(false, true, 5);
		
		fruta.comerFruta(fruta);
		fruta.retirarCaraco();
		fruta.retirarCasca();
		fruta.comerFruta(fruta);

		
	}
}
