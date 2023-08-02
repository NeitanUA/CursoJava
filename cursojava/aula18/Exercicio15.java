package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			double impares = 0;
			double pares = 0;
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o " + i + "º Elemento do VetorA: ");
				vetorA[i] = scan.nextInt();
				if(vetorA[i] % 2 == 0) {
					pares++;
				}				
				else{					
					impares++;
				}
			}
			pares = ((pares / vetorA.length) * 100);
			impares = ((impares / vetorA.length) * 100);
			System.out.println("O Percentual de Elementos ímpares do vetorA é: " + impares + "%");
			System.out.println("O Percentual de Elementos pares do vetorA é: " + pares + "%");
		}
	}
}
