package II_exercicio_1;

public class Locacao {

	private DVD dvd;
	private Socio socio;
	private int idLocacao;
	private String dataLocacao;
	private String dataDevolucao;
	private boolean devolvido;
	
	public Locacao(DVD dvd, Socio socio, int idLocacao, String dataLocacao, String dataDevolucao) {
		this.dvd = dvd;
		this.socio = socio;
		this.idLocacao = idLocacao;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.devolvido = false;
	}
	
	public DVD getDvd() {
		return dvd;
	}
	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}
	public String getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public boolean isDevolvido() {
		return devolvido;
	}
	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
	}
	
	
	
}
