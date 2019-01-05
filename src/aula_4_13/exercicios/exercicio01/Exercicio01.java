package aula_4_13.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe o N termo: ");
		int termo = scan.nextInt();
		
		for(int i=0; i<=termo;i++) {
			System.out.print();
		}
	}

}