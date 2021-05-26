package br.com.bytebank.banco.modelo;

// o nome da classe, agora, é: 
// br.com.bytebank.banco.modelo.CalculadorDeImposto
public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
