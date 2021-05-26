package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		// String não pode ser alterada;
		// Para alterar uma string, tem que criar
		// outra string com a alteração;
		
		// nome.replace("A", "a"); (não funciona)
		
		String outra = nome.replace("A", "a");

		System.out.println(nome);
		System.out.println(outra);
		
		// char é só uma letra e utiliza aspas simples
		char c = nome.charAt(2); // posição 2 da palavra
		System.out.println(c);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
