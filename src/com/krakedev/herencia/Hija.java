package com.krakedev.herencia;

public class Hija extends Padre {
	
	
	
	

	public Hija(int defectos, int virtudes, double totalAhorrado, String nombre) {
		super(defectos, virtudes, totalAhorrado, nombre);
		
	}

	public void escucharBadBunny() {
		System.out.println("Escuchando Música de Bad Bunny");
	}

	@Override
	public String toString() {
		return "Hija [Defectos=" + getDefectos() + ", Virtudes="
				+ getVirtudes() + ", Total Ahorrado=" + getTotalAhorrado() + ", Nombre=" + getNombre()
				+ "]";
	}
	
	
	
}
