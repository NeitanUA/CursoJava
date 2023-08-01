package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			int soma = 0;
			System.out.print("Digite o número inicial: ");
			int primeiro = scan.nextInt();
			System.out.print("Digite o ultimo número: ");
			int ultimo = scan.nextInt();				
			
			for(int i=primeiro; i <= ultimo; i++) {
				soma += i;
			}
			System.out.println("Soma:" + soma);
		}
	}

}
