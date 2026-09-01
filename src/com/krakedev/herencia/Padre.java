package com.krakedev.herencia;

public class Padre {
	
	private int defectos;
	private int virtudes;
	
	
	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
	}
	
	//constructor
	
	public Padre(int defectos, int virtudes) {
		this.defectos = defectos;
		this.virtudes = virtudes;
	}
	
	//get and set
	public int getDefectos() {
		return defectos;
	}
	
	

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
	//Métodos
	
	public void imprimir() {
		System.out.println("Virtudes: "+virtudes);
		System.out.println("Defectos: "+defectos);
	}
	
	//Método privado
	
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
}
