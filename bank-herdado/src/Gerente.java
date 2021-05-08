// extends significa que o Gerente vai herdar do Funcionário e assinar o contrato Autenticável
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
		
	public Gerente() {
		 this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
		// super é usado quando algo está definido na classe mãe
		return super.getSalario();
	}	

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}