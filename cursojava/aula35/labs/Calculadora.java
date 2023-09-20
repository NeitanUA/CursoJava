package com.natanael.cursojava.aula35.labs;

public class Calculadora {
	public static void fibonacci(int num) {
		int a = 1, b = 0, resultado = 0;

		for (int i = 0; i < num; i++) {
			resultado = a + b;
			System.out.println(resultado);
			a = b;
			b = resultado;
		}
	}

	public static int fibonacciRecursivo(int num) {

		if (num < 2) {
			return 1;
		}

		return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
	}

	public static int fatorialRecursivo(int num) {

		if (num == 0) {
			return 1;
		}

		return num * fatorialRecursivo(num - 1);
	}

	public static void fatorial(int num) {

		int resultado = 1;
		for (int i = num; i > 1; i--) {
			resultado *= i;
		}

		System.out.println(resultado);
	}

	public static int somatorio(int num) {

		if (num == 1) {
			return 1;
		}

		return num + somatorio(num - 1);
	}
}
