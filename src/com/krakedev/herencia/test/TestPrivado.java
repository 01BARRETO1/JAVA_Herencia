package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestPrivado {

	public static void main(String[] args) {
		Hija hija = new Hija(2, 4,20.000,"HIJA");
		
		hija.guardarSecreto();

	}

}
