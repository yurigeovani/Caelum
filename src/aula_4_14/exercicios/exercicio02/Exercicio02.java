package aula_4_14.exercicios.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

//		Programa 2
//		Classe: Porta
//		Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
//		Métodos: void abre()
//		void fecha()
//		void pinta(String s)
//		boolean estaAberta()
//
//		Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método
//		estaAberta para vericar se ela está aberta.

		Scanner scan = new Scanner(System.in);
		
		Porta porta = new Porta();
		String abreFecha;
		System.out.print("Informe a cor: ");
		porta.setCor(scan.next());
		System.out.println("Informe as dimensões: ");
		System.out.print("Altura: ");
		porta.setDimensaoX(scan.nextDouble());
		System.out.print("Largura: ");
		porta.setDimensaoY(scan.nextDouble());
		System.out.print("Profundidade: ");
		porta.setDimensaoZ(scan.nextDouble());
		
		if(porta.estaAberta()) {
			System.out.println("A porta está aberta, deseja fechar?");
			abreFecha = scan.next();
			if(abreFecha.equalsIgnoreCase("S") | abreFecha.equalsIgnoreCase("Sim")) {
				porta.setAberta(false);
			}
		} else {
			System.out.println("A porta está fechada, deseja abrir?");
			abreFecha = scan.next();
			if(abreFecha.equalsIgnoreCase("S") | abreFecha.equalsIgnoreCase("Sim")) {
				porta.setAberta(true);
			}
		}
		
		System.out.println(porta);
		
	
	}

}
