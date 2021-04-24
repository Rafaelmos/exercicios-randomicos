package aprendendoGC;

public class ColetorDeLixo {
	
	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[1000];
		Cliente cliente = null;
		
		for (int i=0; i<clientes.length; i++) {
			cliente = new Cliente("Cliente"+i, "(8799999-999)"+i, "cliente"+i+"@email.com");
			clientes[i] = cliente;			
		}
		
		System.out.println("Clientes cadastrado");
		cliente.destroyed(clientes);
		System.out.println("Memória limpa");
	}
	

}

