package aula_4_14.exercicios.exercicio03;

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
	
	public void status() {
		for(int i = 0; i<portas.length;i++) {
			if(portas[i].isAberta()) {
				System.out.println("Porta de cor " + portas[i].getCor() + " est� aberta!");
			} else {
			System.out.println("Porta de cor " + portas[i].getCor() + " est� fechada!");
			}
		}
	}
	
	public void opcoes () {
		System.out.println("OP��ES");
		System.out.println("1) Pintar a casa;");
		System.out.println("2) Pintar as portas;");
		System.out.println("3) Abrir/Fechar as portas;");
		System.out.println("4) Exibir informa��es;");
		System.out.println("5) Quantas portas abertas;");
		System.out.println("0) Sair;");
		System.out.print("Escolha uma das op��es: ");
	}
	
	public void abrirFecharPorta (int i) {
		if(portas[i].isAberta()) {
			portas[i].setAberta(false);
		} else {
			portas[i].setAberta(true);
		}
	}
	
	public int quantasPortasEstaoAbertas() {
		int qtdPortasAbertas = 0;
		for (int i = 0; i<portas.length;i++) {
			if(portas[i].isAberta()) {
				qtdPortasAbertas++;
			}
		}
		return qtdPortasAbertas;
	}
}