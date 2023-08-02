package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);) {
			int[] vetorA = new int[10];
			int pares = 0;

			for (int i = 0; i < vetorA.length; i++) {
				System.out.print("Entre com o valor da posição " + i + " do vetorA: ");
				vetorA[i] = scan.nextInt();
				if (vetorA[i] % 2 == 0) {
					pares++;
				}
			}

			System.out.println("No VetorA " + pares + " Elementos São Pares ");
		}
	}
}
