package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		
		// Object é uma classe mãe que todas as outras classes tem;
		// o java já coloca automaticamente;
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cliente);
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}

	static void println(Object referencia) {
		
	}
}
