package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		// String n�o pode ser alterada;
		// Para alterar uma string, tem que criar
		// outra string com a altera��o;
		
		// nome.replace("A", "a"); (n�o funciona)
		
		String outra = nome.replace("A", "a");

		System.out.println(nome);
		System.out.println(outra);
		
		// char � s� uma letra e utiliza aspas simples
		char c = nome.charAt(2); // posi��o 2 da palavra
		System.out.println(c);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
