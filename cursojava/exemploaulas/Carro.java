package com.natanael.cursojava.exemploaulas;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double comsumoCombustivel;

	void exibirAutonomia() {		
		System.out.println("Autonomia do carro é " + capCombustivel * comsumoCombustivel + " Km");
	}
	
	double obiterAutonomia() {		
		return capCombustivel * comsumoCombustivel;
	}
	
	double calculaCombustivel(double km) {
		return km/comsumoCombustivel;
	}
}
