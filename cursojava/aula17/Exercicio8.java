package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){			
			int num = 0, resultado = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.print("Digite um número: ");
				num = scan.nextInt();
				resultado = num + resultado;
			}
			num = resultado / 5;
			System.out.println("A Soma é: " + resultado);
			System.out.println("A Media é: " + num);
		}
	}
}
