package com.krakedev.herencia;

public class Hija extends Padre {
	
	
	
	public Hija(int defectos, int virtudes) {
		super(defectos, virtudes);
		
	}

	public void escucharBadBunny() {
		System.out.println("Escuchando Música de Bad Bunny");
	}

	@Override
	public String toString() {
		return "Defectos: "+getDefectos()+" Virtudes: "+getVirtudes();
	}
	
	
	
}
