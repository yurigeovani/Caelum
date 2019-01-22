package aula_4_14.exercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		3) Programa 3
//		Classe: Casa
//		Atributos: cor, porta1, porta2, porta3
//		Método: void pinta(String s),
//		int quantasPortasEstaoAbertas()
//		Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar.
//		Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.
		
		Scanner scan = new Scanner(System.in);
		
		Casa casa = new Casa();
		Porta[] portas = new Porta[3];
		
		System.out.print("Informe a cor da casa: ");
		casa.setCor(scan.next());
		
		for(int i=0; i<portas.length;i++) {
			String corPorta;
			System.out.print("Informe a cor da porta " + (i+1) + ": ");
			corPorta = scan.next();
			portas[i].setCor(corPorta);
		}
		
		System.out.println(casa);
	}
}