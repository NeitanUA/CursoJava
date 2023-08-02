package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			int soma = 0; 
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o " + i + "º elemento do vetorA: ");
				vetorA[i] = scan.nextInt();
				if(vetorA[i] % 5 == 0) {
					soma += vetorA[i];
				}
			}
			
			System.out.print("Soma dos Múltiplos de 5 do vetorA = " + soma);			
		}
	}
}
