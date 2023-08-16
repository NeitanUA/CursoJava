package com.natanael.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int menorValorL5 = Integer.MAX_VALUE;
			int maiorValorL5 = Integer.MIN_VALUE;
			int menorValorC7 = Integer.MAX_VALUE;
			int maiorValorC7 = Integer.MIN_VALUE;

			int[][] matriz = new int[10][10];
			Random random = new Random();

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = random.nextInt(0, 9);
				}
			}

			System.out.println("Matriz: ");
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + ", ");
				}
				System.out.println();
			}
			for (int i = 0; i < 10; i++) {				
				if (matriz[4][i] > maiorValorL5) {
					maiorValorL5 = matriz[4][i];
				}
				if (matriz[4][i] < menorValorL5) {
					menorValorL5 = matriz[4][i];
				}
			}

			for (int i = 0; i < 10; i++) {				
				if (matriz[i][6] > maiorValorC7) {
					maiorValorC7 = matriz[i][6];
				}
				if (matriz[i][6] < menorValorC7) {
					menorValorC7 = matriz[i][6];
				}
			}

			System.out.println();
			System.out.println("Maior Valor Linha 5: " + maiorValorL5);
			System.out.println("Menor Valor Linha 5: " + menorValorL5);
			System.out.println("Maior Valor Coluna 7: " + maiorValorC7);
			System.out.println("Menor Valor Coluna 7: " + menorValorC7);
		}
	}
}
