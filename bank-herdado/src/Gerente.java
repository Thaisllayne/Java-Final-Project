// extends significa que o Gerente vai herdar do Funcionário 
public class Gerente extends Funcionario{
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public Gerente() {
		//é um construtor, mesmo nome da Class;
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
		// super é usado quando algo está definido na classe mãe
		return super.getSalario();
	}
	
}