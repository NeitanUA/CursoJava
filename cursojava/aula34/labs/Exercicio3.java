package com.natanael.cursojava.aula34.labs;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double num = 0;

			do {
				System.out.println("Entre com um número positivo: ");
				num = scan.nextDouble();				
			} while (num < 0);
			
			System.out.println(Calculadora.fatorial(num));
		}
	}
}
