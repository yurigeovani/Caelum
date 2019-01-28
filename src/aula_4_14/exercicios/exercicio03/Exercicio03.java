package aula_4_14.exercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		3) Programa 3
//		Classe: Casa
//		Atributos: cor, porta1, porta2, porta3
//		M√©todo: void pinta(String s),
//		int quantasPortasEstaoAbertas()
//		Crie uma casa e pinte-a. Crie tr√™s portas e coloque-as na casa; abra e feche as mesmas como desejar.
//		Utilize o m√©todo quantasPortasEstaoAbertas para imprimir o n√∫mero de portas abertas.
		
		Scanner scan = new Scanner(System.in);
		
		Casa casa = new Casa();
		Porta[] portas = new Porta[3];
		boolean sair = false;
		int escolha = 0;
				
		while(!sair) {
			
			casa.opcoes();
			escolha=scan.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.print("Informe a cor da casa: ");
				casa.setCor(scan.next());
				break;
			case 2:
				for(int i=0; i<portas.length;i++) {
					Porta porta = new Porta();
					System.out.print("Informe a cor da porta " + (i+1) + ": ");
					porta.setCor(scan.next());
					portas[i]=porta;
				}
				break;
			case 3:
				System.out.print("Informe a porta: ");
				casa.abrirFecharPorta(scan.nextInt());
				break;
			case 4:
				casa.status();
				break;
			default:
				System.out.println("Escolha uma opÁ„o v·lida!");
				break;
			}
		}
	}
}