package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		// entendendo a class Integer
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println("O máximo: " + Integer.MAX_VALUE);
		System.out.println("O mínimo: " + Integer.MIN_VALUE);
		System.out.println("O tamanho em bits: " + Integer.SIZE);
		System.out.println("O tamanhoo em bytes: " + Integer.BYTES);
		// constante sempre é em letras maiusculas;
		
		
		int valor = idadeRef.intValue(); // unboxing
				
		// muito comum transformar string em outro tipo primitivo;
		String s = args[0];
		
		// Integer numero = Integer.valueOf(s); ou:
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing

	}

}
