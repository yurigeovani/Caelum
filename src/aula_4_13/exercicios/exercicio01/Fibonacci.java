package aula_4_13.exercicios.exercicio01;

public class Fibonacci {
	private int anterior;
	private int atual;
	private int proximo;
	
	public int getAnterior() {
		return anterior;
	}
	public void setAnterior(int anterior) {
		this.anterior = anterior;
	}
	public int getAtual() {
		return atual;
	}
	public void setAtual(int atual) {
		this.atual = atual;
	}
	public int getProximo() {
		return proximo;
	}
	public void setProximo(int proximo) {
		this.proximo = proximo;
	}
	
	public Fibonacci(int anterior, int atual, int proximo) {
		super();
		this.anterior = anterior;
		this.atual = atual;
		this.proximo = proximo;
	}
	public Fibonacci() {
		super();
		this.anterior = 0;
		this.atual = 1;
		this.proximo = this.anterior+this.atual;
	}
	
	@Override
	public String toString() {
		return "Fibonacci [anterior=" + anterior + ", atual=" + atual + ", proximo=" + proximo + "]";
	}
	
	public void calcularTermo(int termo) {
		if(termo==0) {
			System.out.println("Para o termo " + termo + " a sequencia é: " + getAnterior() + ".");
		} else if (termo == 1){
			System.out.println("Para o termo " + termo + " a sequencia é: " + getAnterior() + ", " + getAtual() + ".");
		} else if (termo>1){
			System.out.print("Para o termo " + termo + " a sequencia é: " + anterior);
			for(int i=1;i<=termo;i++) {
				setAnterior(getAtual());
				System.out.print(", " + getAtual());
				setAtual(getProximo());
				setProximo(getAnterior()+getAtual());
			}
			System.out.println(".");
		} else {
			System.out.println("Informe um número maior ou igual a zero");
		}
	}
}