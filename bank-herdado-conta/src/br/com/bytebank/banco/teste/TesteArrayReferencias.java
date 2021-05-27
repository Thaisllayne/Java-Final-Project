package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		//int[] idades = new int[5];
		Object[] referencias = new Object[5];
		//array de refer�ncias come�am nulos.
		
		ContaCorrente cc1 = new ContaCorrente(22,11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22,22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		// System.out.println(((Conta) contas[0]).getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		// Type Cast: transforma um objeto generico
		// (Conta) em um objeto mais especifico (ContaPoupanca)
		
		System.out.println(ref.getNumero());
		
	}

}
