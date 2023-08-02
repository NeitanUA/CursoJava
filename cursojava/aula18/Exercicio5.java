package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {	
		try(Scanner scan = new Scanner(System.in);) {
			int[] vetorA = new int[10];
			int[] vetorB = new int[vetorA.length];
			for(int i = 0; i < vetorA.length; i++) {
				System.out.print("Digite um numero: ");
				vetorA[i] = scan.nextInt();
				vetorB[i] = vetorA[i] * i;
			}
			
			System.out.println();
			
			System.out.print("Vetor A = ");
			for(int i : vetorA) {
				System.out.print(i + ", ");
			}
			
			System.out.println();
			
			System.out.print("Vetor B = ");
			for(int i : vetorB) {
				System.out.print(i + ", ");
			}			
		}
	}
}
