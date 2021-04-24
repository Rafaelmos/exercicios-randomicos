package III_exercicio_5;

public class Triangulo extends FormaGeometrica{
	private float base;
	private float altura;
	
	
	public Triangulo (String cor, float area, float base, float altura) {
		this.setCor(cor);
		this.setArea(area);
		this.setAltura(altura);
		this.setBase(base);
	}
	
	public void analise(){
		System.out.println("TRIANGULo");
		System.out.println("COR: "+cor);
		System.out.println("AREA: "+area);
		System.out.println("ALTURA: "+altura);
		System.out.println("BASE: "+base);

	}
	
	
	public void calcularArea() {
		area = (base*altura)/2;
		System.out.println(area);
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
