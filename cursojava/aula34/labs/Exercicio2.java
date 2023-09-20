package com.natanael.cursojava.aula34.labs;

public class Exercicio2 {
	public static void main(String[] args) {
		print(Calculadora.somar(1, 1));
		print(Calculadora.subtrair(1, 1));
		print(Calculadora.multiplicar(1, 1));
		print(Calculadora.dividir(1, 1));
		print(Calculadora.elevarPotencia(2, 4));
		
		print(Calculadora.fatorial(5));
	}
	
	static void print(double num) {
		System.out.println(num);
	}
}
