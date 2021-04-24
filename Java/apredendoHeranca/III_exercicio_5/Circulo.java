package III_exercicio_5;

public class Circulo extends FormaGeometrica{
	private float raio;
	private float pi=(float) 3.14;

	public Circulo(String cor, float area, float raio, float pi) {
		this.setCor(cor);
		this.setArea(area);
		this.setPi(pi);
		this.setRaio(raio);
	}

	public void calcularArea() {
		area = pi*(raio*raio);
		System.out.println(area);
	}

	public void analise(){
		System.out.println("CIRCULO");
		System.out.println("COR: "+cor);
		System.out.println("AREA: "+area);
		System.out.println("RAIO: "+raio);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}


}
