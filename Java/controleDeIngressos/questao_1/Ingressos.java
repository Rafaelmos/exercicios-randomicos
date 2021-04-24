package questao_1;

import java.util.Random;

public class Ingressos extends Evento{
	private int id;
	private String dataEmissao;

	public Ingressos(int id, String dataEmissao, String data, String nomeEvento, String local) {
		this.id = id;
		this.dataEmissao = dataEmissao;
		this.setData(data);
		this.setNomeEvento(nomeEvento);
		this.setLocal(local);
	}


	public void emitirIngresso(){
		Random ale = new Random();
		int id = ale.nextInt(20000);
		System.out.println("ID: " + id);
		System.out.println("EMITIDO EM: " + dataEmissao );
		System.out.println("NOME DO EVENTO: " + nomeEvento);
		System.out.println("Local: " +  local);
		System.out.println("Data: " + data);
	}


	public int getId() {
		return id;

	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}




}
