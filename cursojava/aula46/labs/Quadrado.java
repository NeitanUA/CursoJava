package com.natanael.cursojava.aula46.labs;

public class Quadrado extends Figura2D {

	private int lados;

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	@Override
	public double calcularArea() {
				
		return lados * lados;
	}

	@Override
	public String toString() {
		return  "Nome: " + getNome() + "\n"
				+"Cor: " + getCor() + "\n"
				+ "Lados: " + getLados() + "\n"
				+ "Calculo da Área: " + calcularArea();
	}	
	
}
