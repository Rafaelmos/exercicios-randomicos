package aprendendoGC;

public class Cliente {
	public String nome;
	public String contato;
	public String email;
	
	
	public Cliente(String nome, String contato, String email) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.email = email;
	}

	public void destroyed(Cliente[] clientes){
		clientes = null;
		System.gc();
	}
	
}
