package com.natanael.cursojava.aula35;

public class Calculadora {
	public static double fatorialNaoRecursivo(double num) {		
		if (num == 0) {
			return 1;
		}
		
		double resultado = 1;
		for (double i = num; i > 1; i--) {
			resultado *= i;
		}

		return resultado;
	}
	
	public static double fatorial(double num) {
		
		if(num == 0) {
			return 1;
		}
		return num * fatorial(num -1);
	}
}
