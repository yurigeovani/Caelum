package aula_4_13.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		Fibonacci f = new Fibonacci();
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.print("Informe o N termo: ");
//		int termo = scan.nextInt();
//		
//		f.calcularTermo(termo);
		
		for(int i=0;i<=6;i++) {
			System.out.print(Fibonacci.fibonacciRecursico(i) + " ");
		}
	}
}