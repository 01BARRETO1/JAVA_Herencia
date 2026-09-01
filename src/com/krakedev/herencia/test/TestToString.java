package com.krakedev.herencia.test;

import com.krakedev.herencia.Padre;

public class TestToString {

	public static void main(String[] args) {
		Padre padre=new Padre(14000, 13999,20.000,"PADRE");
		System.out.println(padre);
		
		padre.imprimir();

	}

}
