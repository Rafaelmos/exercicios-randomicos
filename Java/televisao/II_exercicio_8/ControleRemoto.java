package II_exercicio_8;

import java.util.Scanner;

public class ControleRemoto extends Televisao {
	
	
	public ControleRemoto(int canal, int volume, boolean ligada) {
		super(canal, volume, ligada);
		// TODO Auto-generated constructor stub
	}

	public void aumentarVolume() {
		if (ligada==true) {
			if (this.volume >=0 && this.volume <=99) {
				this.volume += 1;
				System.out.println("VOLUME É " + this.volume);
			} else {
				System.out.println("VOLUME NAO PODE SER ALTERADO");
			}
		}else {
			System.out.println("A TV ESTA DESLIGADA");}
	}

	public void abaixarVolume() {
		if (ligada==true) {

			if (this.volume >=1 && this.volume <=100) {
				this.volume -= 1;
				System.out.println("VOLUME É " + this.volume);
			} else {
				System.out.println("VOLUME NAO PODE SER ALTERADO");}
		}else {
			System.out.println("A TV ESTA DESLIGADA");
		}
	}

	public void aumentarCanal() {
		if (ligada==true) {

			this.canal += 1;
			System.out.println("CANAL É " + this.canal);
		}else {
			System.out.println("A TV ESTA DESLIGADA");
		}
		}
	
	public void abaixarCanal() {
		if (ligada==true) {

			this.canal -= 1;
			System.out.println("CANAL É " + this.canal);
		}else {
			System.out.println("A TV ESTA DESLIGADA");
		}
		}
	public void escolherCanal() {
		if (ligada==true) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("ESCOLHA O CANAL: ");
			this.canal = input.nextInt();
			System.out.println("CANAL É " + this.canal);
		}else {
			System.out.println("A TV ESTA DESLIGADA");
		}}
	public void verStatus() {
		if (ligada==true) {

			System.out.println("O canal atual é " + this.canal);
			System.out.println("O volume atual é " + this.volume);
		}else {
			System.out.println("A TV ESTA DESLIGADA");
		}}
	public boolean LigarTv() {

		if (this.ligada == false) {
			this.ligada = true;
			System.out.println("LIGADA");		
		} else {
			//if (this.ligada == true)
			this.ligada = false;
			System.out.println("DESLIGADA");	
		}
		return this.ligada;
	}
	

	
}
