package aula_5_5.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		1) Volte ao nosso sistema de Funcionario e crie uma classe Empresa dentro do mesmo arquivo .java. A
//			Empresa tem um nome, cnpj e uma referência a uma array de Funcionario, além de outros atributos que
//				você julgar necessário.
		
//			class Empresa {
//			// outros atributos
//			Funcionario[] empregados;
//			String cnpj;
//			}

		Scanner scan = new Scanner(System.in);
		Empresa empresa = new Empresa();
		Funcionario[] funcionarios = new Funcionario[5];
		
		System.out.print("Informe o nome da empresa: ");
		empresa.setNome(scan.nextLine());
		
		System.out.print("Informe o CNPJ da empresa: ");
		empresa.setCnpj(scan.nextLine());
		
		System.out.print("Informe o e-mail da empresa: ");
		empresa.setEmail(scan.nextLine());
		
		System.out.println("##### CADASTRO DE FUNCIONÁRIOS #####");
		for(int i=0;i<funcionarios.length;i++) {
			Funcionario funcionario = new Funcionario();
			funcionario.setId(i);
			System.out.println("CÓDIGO: " + (i+1));
			System.out.print("NOME: ");
			funcionario.setNome(scan.next());
			System.out.print("SALÁRIO: ");
			funcionario.setSalario(scan.nextDouble());
			funcionarios[i]=funcionario;
		}
		
		System.out.println(empresa);
		
		for(Funcionario f : funcionarios) {
			System.out.println(f);
		}
	}
}