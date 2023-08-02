package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Execicio1 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int [5];
			int[] vetorB = new int [vetorA.length];
						
			for(int i = 0; i < vetorA.length; i++) {
				System.out.print("Entre com o valor da posição: " + i + ": ");
				vetorA[i] = scan.nextInt();
				vetorB[i] = vetorA[i];
			}
			System.out.print("Vetor A = ");
			for(int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + ", ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for(int i = 0; i < vetorB.length; i++) {
				System.out.print(vetorB[i] + ", ");
			}
			System.out.println();
		}
	}

}
