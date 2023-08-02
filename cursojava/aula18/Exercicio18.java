package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[10];
			int maiorIdade = Integer.MIN_VALUE;
			int menorIdade = Integer.MAX_VALUE;
			int iMenor = 0;
			int iMaior = 0;
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o " + i + "º Elemento do VetorA: ");
				vetorA[i] = scan.nextInt();
				
				if (vetorA[i] < menorIdade) {
					menorIdade = vetorA[i];
					iMenor = i;
				}
				else if(vetorA[i] > maiorIdade) {
					maiorIdade = vetorA[i];
					iMaior = i; 
				}
			}
			System.out.println("A Menor Idade é: " + menorIdade);			
			System.out.println("Posições da Menor Idade: " + iMenor);
			
			System.out.println("A Maior Idade é: " + maiorIdade);			
			System.out.println("Posições da Maior Idade: " + iMaior);
		}
	}
}
