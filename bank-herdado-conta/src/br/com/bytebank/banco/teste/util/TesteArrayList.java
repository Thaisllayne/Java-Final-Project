package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//ArrayList é uma class do java.util, que já vem com diversos métodos;
		ArrayList<Conta> lista = new ArrayList<Conta>();
		// Generics
		// significa que esse array só guarda Conta;
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		for ( int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("-----------");
		
		for (Conta conta : lista) {
			// forma mais reduzida
			// significa que para cada elemento da lista, mmostra a conta
			System.out.println(conta);
		}

	}

}
