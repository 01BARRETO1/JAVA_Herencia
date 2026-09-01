package com.krakedev.herencia;

public class Hijo extends Padre {
	
	private int juguetes;
	
	

	public Hijo(int defectos, int virtudes, int juguetes, double TotalAhorrado, String nombre) {
		super(defectos, virtudes, TotalAhorrado, nombre);
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
	
	//SobreEscribir el metodo Ahorrar
	
	@Override
	public void ahorrar(double monto) {
		
		// El hijo solo ahorra el 50% del monto
	    double ahorroHijo = monto * 0.5;
	    super.setTotalAhorrado(super.getTotalAhorrado() + ahorroHijo);
		
	}
	

}
