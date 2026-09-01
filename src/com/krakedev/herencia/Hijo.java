package com.krakedev.herencia;

public class Hijo extends Padre {
	
	private int juguetes;
	
	

	public Hijo(int defectos, int virtudes, int juguetes) {
		super(defectos, virtudes);
		this.juguetes=juguetes;
		
	}
	
	@Override
	public String toString() {
		return "Defectos: "+getDefectos()+" Virtudes: "+getVirtudes()+
				" Juguetes: "+getJuguetes();
	}
	
	//Set and get

	public int getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(int juguetes) {
		this.juguetes = juguetes;
	}
	
	

}
