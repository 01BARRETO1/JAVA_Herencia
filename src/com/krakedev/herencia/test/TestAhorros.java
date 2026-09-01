package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre padre = new Padre(14000, 13999);
		padre.ahorrar(20.000);
		System.out.println(padre);
		
		// hija
		Hija hija = new Hija(2, 4);
		hija.ahorrar(20.000);
		System.out.println("------------------------------------");
		System.out.println("Ahorros: " + hija.getTotalAhorrado()+" "+ hija.toString());
		
		// hijo
		Hijo hijo = new Hijo(2, 4,9);
		hijo.ahorrar(20.000);
		System.out.println("------------------------------------");
		System.out.println("Ahorros: " + hijo.getTotalAhorrado()+" "+ hijo);
		

	}

}
