package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {	
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[8];
			int[] vetorB = new int[8];			
			for(int i = 0; i < vetorA.length; i++){
				System.out.print("Digite um número para posição " + i + " do Array: ");				
				vetorA[i] = scan.nextInt();
				vetorB[i] = vetorA[i] * 2;
			}
			
			System.out.print("VetorA = ");
			for(int i : vetorA) {
				System.out.print(i + ", ");
			}
			
			System.out.println();
			
			System.out.print("VetorB = ");
			for(int i : vetorB) {
				System.out.print(i + ", ");
			}
		}
	}

}
