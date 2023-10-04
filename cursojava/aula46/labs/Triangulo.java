package com.natanael.cursojava.aula46.labs;

public class Triangulo extends Figura2D {

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
				
		return (base * altura) /2;
	}
	
	@Override
	public String toString() {
		return  "Nome: " + getNome() + "\n"
				+"Cor: " + getCor() + "\n"
				+ "Base: " + getBase() + "\n"
				+ "Altura: " + getAltura() + "\n"
				+ "Calculo da Área: " + calcularArea();
	}

}
