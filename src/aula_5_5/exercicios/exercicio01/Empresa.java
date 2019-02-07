package aula_5_5.exercicios.exercicio01;

public class Empresa {
	private String cnpj;
	private String nome;
	private String email;
	private Funcionario[] funcionarios;
	
	public Empresa() {
		super();
	}

	public Empresa(String cnpj, String nome, String email, Funcionario[] funcionarios) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.funcionarios = funcionarios;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + "]";
	}
}
