package aula_4_14.exercicios.exercicio03;

public class Porta {
	private boolean aberta;
	private String cor;
	
	public Porta() {
		super();
		this.aberta = false;
	}
	
	public Porta(boolean aberta, String cor, double largura, double altura, double espessura) {
		super();
		this.aberta = aberta;
		this.cor = cor;
	}
	
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Porta [aberta=" + aberta + ", cor=" + cor + "]";
	}

	public void abreFecha() {
		if(isAberta()) {
			setAberta(false);
		} else {
			setAberta(true);
		}
	}
	
	public boolean estaAberta() {
		if(isAberta()) {
			return true;
		}
		return false;
	}
	
}