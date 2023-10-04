package com.natanael.cursojava.aula46.labs;

public class Cubo extends Figura3D{

	private int lados;

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	@Override
	public double calcularArea() {
		
		return 6 * (lados * lados);
	}

	@Override
	public double calcularVolume() {
		
		return lados * lados * lados;
	}
	
	@Override
	public String toString() {
		return  "Nome: " + getNome() + "\n"
				+"Cor: " + getCor() + "\n"
				+ "Lados: " + getLados() + "\n"
				+ "Calculo do Volume: " + calcularVolume() + "\n"
				+ "Calculo da Área: " + calcularArea();
	}
	
}
