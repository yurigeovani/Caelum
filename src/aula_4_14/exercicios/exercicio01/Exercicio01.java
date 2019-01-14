package aula_4_14.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pessoa pessoa[] = new Pessoa[10];
		int contador = 0;
		
		System.out.println("############### CALCULA ANIVERSÁRIO ###############");
		System.out.println("OPÇÕES");
		System.out.println("1) Cadastrar pessoa;");
		System.out.println("2) Calcular aniversário;");
		System.out.println("3) Exibir dados;");
		System.out.println("0) Sair.");
		System.out.print("Escolha a opção desejada: ");
		int escolha = scan.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			//pessoa[contador].setNome(nome);
			//pessoa[contador].setNome(scan.nextLine());
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			//pessoa[contador].setIdade(idade);
			//pessoa[contador].setIdade(scan.nextInt());
			contador++;
			break;
		case 2:
			System.out.print("Informe o ID da pessoa: ");
			pessoa[scan.nextInt()].fazAniversario();
			pessoa[scan.nextInt()].toString();
			break;
		case 3:
			System.out.print("Informe o ID da pessoa: ");
			pessoa[scan.nextInt()].toString();
			break;
		case 0: 
			break;
		default: System.out.println("Informe uma opção válida!");
			break;
		}
	}
}