package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {	
		try(Scanner scan = new Scanner(System.in);) {
			int resultado = 0;
			int[] vetorA = new int[10];			
			for(int i = 0; i < vetorA.length; i++) {
				System.out.print("Entre com o valor da posição " + i + " do vetorA: ");
				vetorA[i] = scan.nextInt();
				resultado += vetorA[i];
			}
									
			System.out.println("A Soma de todos os elementos do Vetor A é: " + resultado);			
		}
	}
}
