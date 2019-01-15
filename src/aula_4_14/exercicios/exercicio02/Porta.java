package aula_4_14.exercicios.exercicio02;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public Porta() {
		super();
	}
	
	public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		super();
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
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
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	@Override
	public String toString() {
		return "Porta [aberta= " + aberta + ", cor= " + cor + ", dimensaoX= " + dimensaoX + ", dimensaoY =" + dimensaoY
				+ ", dimensaoZ =" + dimensaoZ + "]";
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
