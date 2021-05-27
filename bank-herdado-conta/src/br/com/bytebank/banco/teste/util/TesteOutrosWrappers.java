package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		//tem várias formas de fazer, mas o recomendado é:
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		// Number é a forma mais genérica para números
		Number refNumero = Integer.valueOf(29);
		System.out.println(refNumero.intValue());
		
		// ou seja, todos seguem um padrão;
		
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(43.6);
		lista.add(32.3f);

	}

}
