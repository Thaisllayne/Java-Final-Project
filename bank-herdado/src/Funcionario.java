
// n�o pode instanciar dessa classe, pq � abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	// protected significa p�blico para os filhos
	// ou seja, a Class Gerente tamb�m pode ter acesso
	
	public Funcionario() {
		//� um construtor, mesmo nome da Class;
	}
	
	// m�todo sem corpo, n�o h� implementa��o:
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
