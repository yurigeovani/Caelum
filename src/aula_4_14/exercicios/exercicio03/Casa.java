package aula_4_14.exercicios.exercicio03;

import java.util.Arrays;

public class Casa {
	private String cor;
	private Porta[] portas;
	
	public Casa() {
		super();
	}
	public Casa(String cor, Porta[] portas) {
		super();
		this.cor = cor;
		this.portas = portas;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Porta[] getPortas() {
		return portas;
	}
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	
	@Override
	public String toString() {
		return "Casa [cor=" + cor + ", portas=" + Arrays.toString(portas) + ", getCor()=" + getCor() + ", getPortas()="
				+ Arrays.toString(getPortas()) + "]";
	}
	
	
}