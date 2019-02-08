package aula_5_8.exercicios.exercicio01;

import java.util.Arrays;

public class Casa {
	private String cor;
	private int totalPortas;
	private Porta[] portas;

	public Casa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Casa(String cor, int totalPortas, Porta[] portas) {
		super();
		this.cor = cor;
		this.totalPortas = totalPortas;
		this.portas = portas;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTotalPortas() {
		return totalPortas;
	}
	public void setTotalPortas(int totalPortas) {
		this.totalPortas = totalPortas;
	}
	public Porta[] getPortas() {
		return portas;
	}
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	
	@Override
	public String toString() {
		return "Casa [cor=" + cor + ", totalPortas=" + totalPortas + ", portas=" + Arrays.toString(portas) + "]";
	}
	
	public void opcoes() {
		System.out.println("########## OPÇÕES ##########");
		System.out.println("1) Adicionar porta;");
		System.out.println("2) Pintar porta;");
		System.out.println("3) Abrir porta;");
		System.out.println("4) Fechar porta;");
		System.out.print("Opção escolhida: ");
	}
}