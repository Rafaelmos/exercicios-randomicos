package III_exercicio_5;

public class Quadrado extends FormaGeometrica{
	private float lado;
	
	public Quadrado(String cor, float area, float lado){
		this.setCor(cor);
		this.setArea(area);
		this.setLado(lado);
	}
	
	public void calcularArea() {
		area = lado*lado;
		System.out.println(area);
	}
	public void analise(){
		System.out.println("QUADRADO");
		System.out.println("COR: "+cor);
		System.out.println("AREA: "+area);
		System.out.println("LADO: "+lado);
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
}
