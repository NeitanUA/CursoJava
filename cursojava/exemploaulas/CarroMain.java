package com.natanael.cursojava.exemploaulas;

public class CarroMain {
	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.comsumoCombustivel = 0.15;
		
		System.out.println("Maraca: " + fusca.marca);
		System.out.println("Modelo: " + fusca.modelo);
		System.out.println("Capacidade de passageiros: " + fusca.numPassageiros);
		System.out.println("Capacidade de combustivel: " +fusca.capCombustivel);
		System.out.println("Consumo de combustivel: " +fusca.comsumoCombustivel);
		fusca.exibirAutonomia();
		
		double autonomia = fusca.obiterAutonomia();
		System.out.println("Autonomia por variavel: " + autonomia);		
		System.out.println("Autonomia com retorno: " + fusca.obiterAutonomia());
		
		System.out.println("Consumo combustivel 10km: " + fusca.calculaCombustivel(10));
	}

}
