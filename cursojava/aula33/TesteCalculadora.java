package com.natanael.cursojava.aula33;

public class TesteCalculadora{
	public static void main(String [] args) {
		MinhaCalculadora calculadora = new MinhaCalculadora();
		int[] vetorInteiros = new int[4];
		vetorInteiros[0] = 50;
		vetorInteiros[1] = 50;
		vetorInteiros[2] = 50;
		vetorInteiros[3] = 50;
		
		calculadora.soma(50.5, 50.5);
		calculadora.soma(50, 50, 50);
		calculadora.soma(50, 50);
		calculadora.soma(vetorInteiros);
		
		System.out.println(calculadora.soma(50.5, 50.5));
		System.out.println(calculadora.soma(50, 50, 50));
		System.out.println(calculadora.soma(50, 50));
		System.out.println(calculadora.soma(vetorInteiros));
	}
}
