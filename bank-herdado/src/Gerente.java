// extends significa que o Gerente vai herdar do Funcion�rio 
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
		//� um construtor, mesmo nome da Class;
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		// super � usado quando algo est� definido na classe m�e
		return super.getSalario();
	}
	
}