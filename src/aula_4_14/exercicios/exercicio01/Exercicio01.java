package aula_4_14.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pessoa[] pessoas = new Pessoa[10];
		int contador = 0;
		int escolha = 999;
		
		while(escolha!=0) {
			System.out.println("############### CALCULA ANIVERS�RIO ###############");
			System.out.println("OP��ES");
			System.out.println("1) Cadastrar pessoa;");
			System.out.println("2) Calcular anivers�rio;");
			System.out.println("3) Exibir dados;");
			System.out.println("0) Sair.");
			System.out.print("Escolha a op��o desejada: ");
			escolha = scan.nextInt();
			
			switch (escolha) {
			case 1:
				Pessoa pessoa = new Pessoa();
				System.out.print("Nome: ");
				pessoa.setNome(scan.next());
				System.out.print("Idade: ");
				pessoa.setIdade(scan.nextInt());
				pessoas[contador]=pessoa;
				contador++;
				break;
			case 2:
				System.out.print("Informe o ID da pessoa: ");
				System.out.println(pessoas[scan.nextInt()].fazAniversario());
				break;
			case 3:
				System.out.print("Informe o ID da pessoa: ");
				System.out.println(pessoas[scan.nextInt()].toString());
				break;
			case 0: 
				System.out.println("Tem certeza que deseja sair do sistema? [S/N]");
				String sair = scan.next();
				if(sair.equalsIgnoreCase("Sim") || sair.equalsIgnoreCase("S")) {
					escolha = 0;
				} else if (sair.equalsIgnoreCase("N�o") || sair.equalsIgnoreCase("Nao") || sair.equalsIgnoreCase("N")) {
					escolha = 999;
				} else {
					System.out.println("Informe uma op��o v�lida!");
					escolha = 999;
				}
				break;
			default: 
				System.out.println("Informe uma op��o v�lida!");
				break;
			}
		}
		
	}
}