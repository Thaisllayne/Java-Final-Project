// extends significa que o Gerente vai herdar do Funcion�rio e assinar o contrato Autentic�vel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
		
	public Gerente() {
		 this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		// super � usado quando algo est� definido na classe m�e
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