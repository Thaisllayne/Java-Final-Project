
// não pode instanciar dessa classe, pq é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	// protected significa público para os filhos
	// ou seja, a Class Gerente também pode ter acesso
	
	public Funcionario() {
		//é um construtor, mesmo nome da Class;
	}
	
	// método sem corpo, não há implementação:
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
