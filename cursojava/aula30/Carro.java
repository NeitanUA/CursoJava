package com.natanael.cursojava.aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double comsumoCombustivel;

	Carro() {
	}

	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double comsumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.comsumoCombustivel = comsumoCombustivel;
	}

	Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this("Fiat", "Ducato");
	}

	void exibirAutonomia() {
		System.out.println("Autonomia do carro é " + this.capCombustivel * this.comsumoCombustivel + " Km");
	}

	double obiterAutonomia() {
		System.out.println("Metódo obterAutonomia foi chamado.");

		return this.capCombustivel * this.comsumoCombustivel;
	}

	double calculaCombustivel(double km) {
		double qtdCombustivel = km / this.comsumoCombustivel;

		return qtdCombustivel;
	}
}