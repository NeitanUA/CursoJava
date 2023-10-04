package com.natanael.cursojava.aula46.labs;

public class Circulo extends Figura2D {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		 
		return Math.PI * (raio * raio);
	}
	
	@Override
	public String toString() {
		return  "Nome: " + getNome() + "\n"
				+"Cor: " + getCor() + "\n"
				+ "Calculo da Área: " + calcularArea();
	}
	
}
