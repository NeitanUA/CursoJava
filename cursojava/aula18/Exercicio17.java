package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[10];
			int maiorQ35 = 0;
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o " + i + "º Elemento do VetorA: ");
				vetorA[i] = scan.nextInt();
				if (vetorA[i] > 35) {
					maiorQ35 ++;
				}
			}
			System.out.println("A Quantidade de pessoa que possuem a idade maior que 35 é: " + maiorQ35);			
		}
	}
}
