package com.natanael.cursojava.aula34.labs;

public class Calculadora {

	public static double somar(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}

	public static double elevarPotencia(double num1, double num2) {
		double resultado = 1;
		for (double i = 0; i < num2; i++) {
			resultado *= num1;
		}
		return resultado;
	}

	public static double fatorial(double num) {		
		if (num == 0) {
			return 1;
		}
		
		double resultado = 1;
		for (double i = num; i > 1; i--) {
			resultado *= i;
		}

		return resultado;
	}
}
