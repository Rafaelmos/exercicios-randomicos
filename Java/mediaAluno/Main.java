package mediaAluno;

public class Main {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Robertinho", 101);
		
		aluno.mediaNotas(5.2, 7, 4);
		aluno.situacaoAluno();
	}
}
