package II_exercicio_1;

public class Filme {

	private int idFilme;
	private String titulo;
	private String sinopse;
	private int ano;
	private String diretor;
	private String genero;
	
	public Filme(int idFilme, String titulo, String sinopse, int ano, String diretor, String genero) {
		this.setIdFilme(idFilme);
		this.setTitulo(titulo);
		this.setSinopse(sinopse);
		this.setAno(ano);
		this.setDiretor(diretor);
		this.setGenero(genero);		
	}
	
	public int getIdFilme() {
		return idFilme;
	}
	
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
