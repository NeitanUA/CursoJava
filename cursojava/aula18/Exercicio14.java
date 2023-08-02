package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			int soma = 0;
			int impares = 0;
			for(int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o " + i + "º Elemento do VetorA: ");
				vetorA[i] = scan.nextInt();
				if(vetorA[i] % 2 != 0) {
					soma += vetorA[i];
					impares++;
				}
			}
			
			System.out.println("A Soma dos Elementos ímpares do vetorA = " + soma);
			System.out.println("A Média dos Elementos ímpares do vetorA = " + (soma / impares));			
		}
	}
}
