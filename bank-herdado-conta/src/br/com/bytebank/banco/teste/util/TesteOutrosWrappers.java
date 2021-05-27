package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		//tem v�rias formas de fazer, mas o recomendado �:
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		// Number � a forma mais gen�rica para n�meros
		Number refNumero = Integer.valueOf(29);
		System.out.println(refNumero.intValue());
		
		// ou seja, todos seguem um padr�o;
		
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(43.6);
		lista.add(32.3f);

	}

}
