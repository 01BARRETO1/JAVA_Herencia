package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		
		Hija hija=new Hija(2, 4,20.000,"HIJA");
		
		hija.setVirtudes(5);
		hija.setDefectos(2);
		
		System.out.println("Virtudes: "+hija.getVirtudes());
		System.out.println("Defectos: "+hija.getDefectos());
		
		System.out.println("-------------");
		//método imrpimr herencia
		hija.imprimir();

	}

}
