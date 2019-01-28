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
	
//	@Override
//	public String toString() {
//		return "Casa [cor=" + cor + ", portas=" + Arrays.toString(portas) + ", getCor()=" + getCor() + ", getPortas()="
//				+ Arrays.toString(getPortas()) + "]";
//	}
	
	@Override
	public String toString() {
		return "Casa [cor=" + cor + ", portas=" + Arrays.toString(portas) + ", getCor()=" + getCor() + ", getPortas()="
				+ Arrays.toString(getPortas()) + "]";
	}
	
	public void status() {
		for(int i = 0; i<portas.length;i++) {
			if(portas[i].isAberta()) {
				System.out.println("Porta de cor " + portas[i].getCor() + " está aberta!");
			}
			System.out.println("Porta de cor " + portas[i].getCor() + " está fechada!");
		}
	}
	
	public void opcoes () {
		System.out.println("OPÇÕES");
		System.out.println("1) Pintar a casa;");
		System.out.println("2) Pintar as portas;");
		System.out.println("3) Abrir/Fechar as portas;");
		System.out.println("4) Exibir informações;");
		System.out.println("0) Sair;");
		System.out.print("Escolha uma das opções: ");
	}
	
	public void abrirFecharPorta (int i) {
		if(portas[i].isAberta()) {
			portas[i].setAberta(false);
		} else {
			portas[i].setAberta(true);
		}
	}
}