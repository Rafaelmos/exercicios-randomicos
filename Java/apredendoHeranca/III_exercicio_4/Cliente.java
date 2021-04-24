package III_exercicio_4;

import java.util.Scanner;

public class Cliente extends Conta{
	private String nome;
	private String cpf;
	private float renda=0;
	

	public Cliente(String nome, String cpf, int id, String corrente,String cartao, String poupanca, float redimento, float saldoCorrente,float  saldoPoupanca) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setId(id);
		this.setCorrente(corrente);
		this.setCartao(cartao);
		this.setPoupanca(poupanca);
		this.setRendimento(redimento);
		this.setSaldoCorrente(saldoCorrente);
		this.setSaldoPoupança(saldoPoupanca);
	}
	
	
	public void verConta() {
		System.out.println("Nome: " + nome + "\nID da conta: " + id);
		System.out.println("Conta " + corrente + " \nCartão: " + cartao);
		System.out.println("Conta " + poupanca + " redimento: " + rendimento);
		System.out.println("Conta Corrente: " + saldoCorrente);
		System.out.println("Conta Poupança: " + saldoPoupanca);
		
		
	}
	
	public void verSaldo() {
		System.out.println("Saldo da conta Corrente:" + saldoCorrente + " R$");
		System.out.println("Saldo da conta Poupança:" + saldoPoupanca + " R$");
	}

	public void sacarCorrente() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		float saque = input.nextFloat();
		if (saldoCorrente>=saque) {
			saldoCorrente -= saque;
			System.out.println("Saque efetuado");
		} else {
			System.out.println("Conta sem saldo");
		}
	}

	public void sacarPoupança() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		float saque = input.nextFloat();
		if (saldoPoupanca>=saque) {
			saldoPoupanca -= saque;
			System.out.println("Saque efetuado");
		} else {
			System.out.println("Conta sem saldo");
		}
	}
	
	public void depositarCorrente() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		float deposito = input.nextFloat();
		saldoCorrente+= deposito;
		System.out.println("Deposito efetuado");
	}
	
	public void depositarPoupança() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		float deposito = input.nextFloat();
		saldoPoupanca+= deposito;
		System.out.println("Deposito efetuado");
	}
	
	public void render() {
		renda = saldoPoupanca*(rendimento/100);
		saldoPoupanca += renda;
		System.out.println("Valor rendeu");
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
