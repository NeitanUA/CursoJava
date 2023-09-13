package com.natanael.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double comsumoCombustivel;	
	
	Carro(){}
	
	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double comsumoCombustivel){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.comsumoCombustivel = comsumoCombustivel;
	}
	
	void exibirAutonomia() {		
		System.out.println("Autonomia do carro é " + capCombustivel * comsumoCombustivel + " Km");
	}
	
	double obiterAutonomia() {
		System.out.println("Metódo obterAutonomia foi chamado.");

		return capCombustivel * comsumoCombustivel;
	}
	
	double calculaCombustivel(double km) {
		double qtdCombustivel = km / comsumoCombustivel;
		
		return qtdCombustivel;
	}
}

