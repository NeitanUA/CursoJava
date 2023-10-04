package com.natanael.cursojava.aula46.labs;

public class Piramide extends Figura3D {
	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPoliBase;
	private Figura2D base;

	public int getNumPoliBase() {
		return numPoliBase;
	}
	
	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		
		if(base != null) {
			return (numPoliBase * ((arestaBase * apotema) /2) + base.calcularArea());
		}
		return 0;
	}

	@Override
	public double calcularVolume() {
		
		if(base != null) {
			return (base.calcularArea() * altura) / 3;
		}
		
		return 0;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\n" 
				+"Cor: " + getCor() + "\n"
				+ "Altura: " +  getAltura() + "\n" 
				+ "Aresta Base: " + getArestaBase() + "\n"
				+ "Apotema: " + getApotema() + "\n" 
				+ "Numero Base Poligonais: " + getNumPoliBase() + "\n"
				+ "----- Base -----\n" + getBase() + "\n----------------\n"
				+ "Calculo da Área: " + calcularArea() + "\n"
				+ "Calculo do Volume: " + calcularVolume();
		
	}
	
	
}
