package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// no lugar do LinkedList, pode ser ArrayList ou Vector;
		List<Conta> lista = new LinkedList<Conta>();
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		lista.add(cc3);
		
		System.out.println("Existe no array? " 
				+ lista.contains(cc2));
		// o contains procura pelo método equals, que está na class Conta;
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
