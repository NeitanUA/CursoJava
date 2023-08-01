package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			int maiorNumero = Integer.MIN_VALUE;
			int num;
			for (int i = 1; i <= 5; i++) {
				System.out.print("Digite um número: ");
				num = scan.nextInt();
				if(num >= maiorNumero) {
					maiorNumero = num;
				}
			}
			System.out.println("O maior numero que você digitou é: " + maiorNumero);
		}
	}
}
