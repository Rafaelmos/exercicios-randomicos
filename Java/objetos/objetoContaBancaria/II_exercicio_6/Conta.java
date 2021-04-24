package II_exercicio_6;

import java.util.Scanner;

public class Conta {
	private String banco;
	private int numConta;
	private float saldo;
	
	public Conta(String banco, int numConta, float saldo) {
		this.banco = banco;
		this.numConta = numConta;
		this.saldo= saldo;
	}
	
	
	public void Sacar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digiter o valor do saque");
		float saque = input.nextFloat();
		if (saque > this.saldo) {
			System.out.println("SALDO MENOR QUE O VALOR DO SAQUE");
			} else {
				this.saldo -= saque;
				System.out.println("O saque de " + saque + "R$ Foi Realizado");
				System.out.println("O saldo atual é " + this.saldo +  " R$");
			}
		}
	public void Depositar() {
		System.out.println("Digiter o valor do deposito");
		Scanner input = new Scanner(System.in);
		float deposito = input.nextFloat();
		this.saldo += deposito;
		System.out.println("O saldo atual é " + this.saldo +  " R$");
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
	
	
	
}
