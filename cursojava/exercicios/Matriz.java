package com.natanael.cursojava.exercicios;


import java.util.Locale;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);;
			
			System.out.print("Qual a Ordem da Matriz? ");
			int ordem = scan.nextInt();
			double soma = 0;
			double[][] vetorA = new double[ordem][ordem];
			
			for(int i=0; i<vetorA.length; i++) {
				for(int j=0; j<vetorA[i].length;j++) {
					System.out.println("Digite os Valores da matriz: ");
					vetorA[i][j] = scan.nextDouble();											
				}
			}
			
			for(int i=0; i<ordem; i++){
				soma += vetorA[i][i];
			}
			
			System.out.println();
			System.out.println("Matriz: ");
			for (int i = 0; i < vetorA.length; i++) {
				for (int j = 0; j < vetorA[i].length; j++) {
					System.out.print(vetorA[i][j] + ", ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.print("Soma da Diagonal Principal: " + soma);
		}
	}
}
