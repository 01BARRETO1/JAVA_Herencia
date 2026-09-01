package com.krakedev.herencia;

public class Padre {

	private int defectos;
	private int virtudes;

	// nuevo atributo
	private double totalAhorrado;
	// Atributo nombre
	private String nombre;

	@Override
	public String toString() {
		return "Padre [Defectos=" + defectos + ", virtudes=" + virtudes + ", totalAhorrado=" + totalAhorrado
				+ ", nombre=" + nombre + "]";
	}
	// constructor

	public Padre(int defectos, int virtudes, double totalAhorrado, String nombre) {
		this.defectos = defectos;
		this.virtudes = virtudes;
		this.totalAhorrado = totalAhorrado;
		this.nombre = nombre;
	}

	// get and set
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

	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos
	public void imprimir() {
		System.out.println("Virtudes: " + virtudes);
		System.out.println("Defectos: " + defectos);

	}

	// Método privado
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}

	// Nuevo método
	public void ahorrar(double monto) {
		this.totalAhorrado += monto;
	}

}
