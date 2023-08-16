package com.natanael.cursojava.exercicios;

public class CarroMain {
	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.comsumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println(fusca.numPassageiros);
		System.out.println(fusca.capCombustivel);
		System.out.println(fusca.comsumoCombustivel);
	}

}
