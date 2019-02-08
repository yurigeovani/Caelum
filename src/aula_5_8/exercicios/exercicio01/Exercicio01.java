package aula_5_8.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//			Crie uma casa, pinte-a. Crie três portas e coloque-as na casa através do método adicionaPorta, abra e
//			feche-as como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas
//			abertas e o método totalDePortas para imprimir o total de portas em sua casa.
//			
//			Classe: Casa 
//			Atributos: cor, totalDePortas, portas[] 
//			Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), void adicionaPorta(Porta p), int totalDePortas()

		Scanner scan = new Scanner(System.in);
		
		Casa casa = new Casa();
		Porta[] potas = new Porta[3];
		boolean sair = false;
		int opcoes = 0;
		
		System.out.print("Informe a cor da casa: ");
		casa.setCor(scan.nextLine());
		
		while(!sair) {
			casa.opcoes();
			opcoes = scan.nextInt();
			
			switch (opcoes) {
			case 1:
				break;

			case 0:
				System.out.println("Tem certeza que deseja sair[S/N]?");
				String certeza = scan.nextLine();
				if(certeza.equalsIgnoreCase("S") || certeza.equalsIgnoreCase("SIM")) {
					sair = true;
				} else if(certeza.equalsIgnoreCase("N") || certeza.equalsIgnoreCase("NAO") || certeza.equalsIgnoreCase("NÃO")) {
					sair = false;
				} else {
					System.out.println("Escolha uma opção válida!");
				}
				break;
			default:
				System.out.println("Escolha uma opção válida!");
			}			
		}
	}
}