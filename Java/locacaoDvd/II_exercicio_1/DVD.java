package II_exercicio_1;

public class DVD {

	private Filme filme;
	private int idDVD;
	private String status;
	
	public DVD(Filme filme, int idDVD, String status) {
		this.setFilme(filme);
		this.setIdDVD(idDVD);
		this.setStatus(status);
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public int getIdDVD() {
		return idDVD;
	}
	
	public void setIdDVD(int idDVD) {
		this.idDVD = idDVD;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
