package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[10];
			int igualA15 = 0;
			int menorQ15 = 0;
			double maiorQ15 = 0;
			int qtdMaiorQ15 = 0;
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o " + i + "º Elemento do VetorA: ");
				vetorA[i] = scan.nextInt();
				if (vetorA[i] < 15 ) {
					menorQ15 += vetorA[i];
				} else if(vetorA[i] == 15) {
					igualA15 ++;
				}
				 else if(vetorA[i] > 15) {
					 maiorQ15 += vetorA[i];
					 qtdMaiorQ15++;
				}
			}
			System.out.println("A Soma de Elementos Armazenado no vetorA que São Menor que 15 é: " + menorQ15);
			System.out.println("A Quantidade de Elementos Armazenado no VetorA que são Iguais a 15 é: " + igualA15);
			System.out.println("A Média de Elementos Armazenado no VetorA Que são Maior que 15 é: " + (maiorQ15 / qtdMaiorQ15));
		}
	}
}
