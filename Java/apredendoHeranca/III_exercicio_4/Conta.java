package III_exercicio_4;

public class Conta{
	protected int id;
	protected String corrente, cartao;
	protected String poupanca;
	protected float rendimento;
	protected float saldoCorrente;
	protected float saldoPoupanca;


	//	public void verSaldo() {
	//		System.out.println("Saldo da conta Corrente:" + saldoCorrente + " R$");
	//		System.out.println("Saldo da conta Poupança:" + saldoPoupança + " R$");
	//	}
	//
	//	public void sacarCorrente() {
	//		Scanner input = new Scanner(System.in);
	//		float saque = input.nextFloat();
	//		if (saldoCorrente>=saque) {
	//			saldoCorrente -= saque;
	//			System.out.println("Saque efetuado");
	//		} else {
	//			System.out.println("Conta sem saldo");
	//		}
	//	}
	//
	//	public void sacarPoupança() {
	//		Scanner input = new Scanner(System.in);
	//		float saque = input.nextFloat();
	//		if (saldoPoupança>=saque) {
	//			saldoPoupança -= saque;
	//			System.out.println("Saque efetuado");
	//		} else {
	//			System.out.println("Conta sem saldo");
	//		}
	//	}
	//	
	//	public void depositarCorrente() {
	//		Scanner input = new Scanner(System.in);
	//		float deposito = input.nextFloat();
	//		saldoCorrente+= deposito;
	//		System.out.println("Deposito efetuado");
	//	}
	//	
	//	public void depositarPoupança() {
	//		Scanner input = new Scanner(System.in);
	//		float deposito = input.nextFloat();
	//		saldoPoupança+= deposito;
	//		System.out.println("Deposito efetuado");
	//	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCorrente() {
		return corrente;
	}


	public void setCorrente(String corrente) {
		this.corrente = corrente;
	}


	public String getCartao() {
		return cartao;
	}


	public void setCartao(String cartao) {
		this.cartao = cartao;
	}


	public String getPoupanca() {
		return poupanca;
	}


	public void setPoupanca(String poupanca) {
		this.poupanca = poupanca;
	}


	public float getRendimento() {
		return rendimento;
	}


	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}


	public float getSaldoCorrente() {
		return saldoCorrente;
	}


	public void setSaldoCorrente(float saldoCorrente) {
		this.saldoCorrente = saldoCorrente;
	}


	public float getSaldoPoupança() {
		return saldoPoupanca;
	}


	public void setSaldoPoupança(float saldoPoupança) {
		this.saldoPoupanca = saldoPoupança;
	}





}
