package mediaAluno;

public class Aluno {
	public String nome;
	public int matricula;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		
	}
	
	public void mediaNotas(double nota1, double nota2, double nota3) {
		if (nota1<nota2 && nota1<nota3 || (nota2==nota3 && nota2>nota1)){
			media = (nota2+nota3)/2;
		    System.out.println("Notas maiores " + nota2 + " e " + nota3);
		} else if (nota1==nota2 && nota2==nota3) {
			media = (nota1+nota2)/2;
		    System.out.println("Notas maiores " + nota1 + " e " + nota2);
		} else if (nota2 < nota1 && nota2<nota3 || (nota1==nota3 && nota1>nota2)) {
			media = (nota1+nota3)/2;
		    System.out.println("Notas maiores " + nota1 + " e " + nota3);
		} else if (nota3<nota2 && nota3<nota1 || (nota1==nota2 && nota1>nota2)) {
		    media = (nota1+nota2)/2;
		    System.out.println("Notas maiores " + nota1 + " e " + nota2);
		}
		System.out.println("A média é: " + media);
	}
	
	public void situacaoAluno() {
		if (media>=7) {
			System.out.println("Aluno aprovado");
		} else  {
			System.out.println("Aluno precisará fazer a prova final");
		}
	}
}




