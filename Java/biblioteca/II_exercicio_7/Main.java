package II_exercicio_7;

public class Main {
	public static void main(String[] args) {
		Usuario usuario01 = new Usuario(15151, "Rafael", "rafael..@gmail.com", "Paopizza", "*****", null, 1);

		Livro livro01 = new Livro(1, "Senhor dos Aneis", 3000, "SXS", null, null);
		Emprestimo emprestimo = new Emprestimo(1, "", "", usuario01, livro01);
		usuario01 = new Usuario(15151, "Rafael", "rafael..@gmail.com", "Paopizza", "*****", emprestimo , 1);
		
		//usuario01.realizarEmprestimo(id, data, dataDevolucao, livro, usuario);
	}
}
