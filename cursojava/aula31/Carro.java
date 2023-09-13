package com.natanael.cursojava.aula31;

public class Carro {
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double comsumoCombustivel;	
	
	public Carro(){}
	
	public Carro(String marca, String modelo, int numPassageiros, 
			double capCombustivel, double comsumoCombustivel){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.comsumoCombustivel = comsumoCombustivel;
	}
		
	public Carro(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {		
		this("Fiat", "Ducato");
	}

	public void exibirAutonomia() {		
		System.out.println("Autonomia do carro é " + this.capCombustivel * this.comsumoCombustivel + " Km");
	}
	
	public double obiterAutonomia() {
		System.out.println("Metódo obterAutonomia foi chamado.");

		return this.capCombustivel * this.comsumoCombustivel;
	}
	
	public double calculaCombustivel(double km) {
		double qtdCombustivel = km / this.comsumoCombustivel;
		
		return qtdCombustivel;
	}
}
