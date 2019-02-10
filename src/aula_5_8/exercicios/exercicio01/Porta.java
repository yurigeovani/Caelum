package aula_5_8.exercicios.exercicio01;

public class Porta {
	private String cor;
	private boolean aberta;

	public Porta() {
		super();
	}
	public Porta(String cor, boolean aberta) {
		super();
		this.cor = cor;
		this.aberta = aberta;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	@Override
	public String toString() {
		return "Porta [cor=" + cor + ", aberta=" + aberta + "]";
	}	
}