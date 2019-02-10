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
		Porta[] portas = new Porta[3];
		boolean sair = false;
		int opcoes = 0;
		
		System.out.print("Informe a cor da casa: ");
		casa.setCor(scan.nextLine());
		
		while(!sair) {
			casa.opcoes();
			opcoes = scan.nextInt();
			
			switch (opcoes) {
			case 1:
				if(casa.getTotalPortas()>=3) {
					System.out.println("As 3 portas já foram adicionadas!");
				} else {
					Porta porta = new Porta();
					portas[casa.getTotalPortas()]=porta;
					System.out.println("Porta "+ (casa.getTotalPortas()+1) +" adicionada com sucesso!");
					casa.setTotalPortas(casa.getTotalPortas()+1);
				}
				break;
			
			case 2:
				if(casa.getTotalPortas()==0) {
					System.out.println("Nenhuma porta foi adicionada! Favor, primeiro adicionar porta e depois pintar!");
				} else {
					System.out.print("Informe a porta que deseja pintar: ");
					for(int i=1;i<=casa.getTotalPortas();i++) {
						System.out.print(i + " ");
					}
					System.out.print("? ");
					int escolha = scan.nextInt();
					System.out.print("Informe a cor: ");
					String cor = scan.next();
					portas[escolha-1].setCor(cor);
				}
				break;
			
			case 5:
				System.out.println(casa);
				casa.listarPortas();
				break;
				
			case 0:
				System.out.print("Tem certeza que deseja sair[S/N]?");
				String certeza = scan.next();
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