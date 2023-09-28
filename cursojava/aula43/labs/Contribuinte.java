package com.natanael.cursojava.aula43.labs;

import java.text.DecimalFormat;

public abstract class Contribuinte {

	DecimalFormat format = new DecimalFormat("0.00");
	
	private String nome;
	private double rendaBruta;	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}	
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		return "Nome do contribuinte: " + getNome() + "\n"
				+ "Renda bruta: $" + format.format(getRendaBruta()) + "\n" ;
	}	
	
}
