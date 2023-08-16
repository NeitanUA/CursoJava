package com.natanael.cursojava.aula20;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int pares = 0;
			int inpares = 0;
			int[][] matriz = new int[3][3];
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print("Digite valores para preencher a Matrix: ");
					matriz[i][j] = scan.nextInt();
					
				}
			}
			
			System.out.println();
			System.out.println("Matriz: ");
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + ", ");
					if(matriz[i][j] % 2 == 0) {
						pares ++;
					}
					else {
						inpares++;
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("A Quantidade de Números Pares é: " + pares);
			System.out.println("A Quantidade de Números Inpares é: " + inpares);
		}
	}
}