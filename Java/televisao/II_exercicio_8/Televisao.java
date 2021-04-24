package II_exercicio_8;

import java.util.Scanner;

public class Televisao {
	protected int canal=10;
	protected int volume=50;
	protected boolean ligada = false;

	public Televisao(int canal,int volume, boolean ligada) {
		this.canal=canal;
		this.volume=volume;
		this.ligada=false;
	}







	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}


}
