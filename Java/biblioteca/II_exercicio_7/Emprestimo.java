package II_exercicio_7;

public class Emprestimo {
	private int id;
	private String data;
	private String dataDevolucao;
	private Usuario usuario;
	private Livro livro;
	
	
	public Emprestimo(int id, String data, String dataDevolucao, Usuario usuario, Livro livro) {
		this.id = id;
		this.data = data;
		this.dataDevolucao = dataDevolucao;
		this.usuario = usuario;
		this.livro = livro;
	}
	
	
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	
	
}
