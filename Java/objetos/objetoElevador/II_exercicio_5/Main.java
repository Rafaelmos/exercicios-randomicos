package II_exercicio_5;

public class Main {
	public static void main(String[] args) {
		Elevador elevator01 = new Elevador(0,0,30,30);
		//elevator01.Inicializar(30, 30);
		elevator01.Entrar();
		elevator01.Sair();

		elevator01.Descer();
		elevator01.Subir();
		
		elevator01.Status();
	}
}
