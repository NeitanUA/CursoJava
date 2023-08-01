package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){			
			int numero = 0;
			int pares = 0;
			int impares = 0;
			for(int i = 1; i <= 10; i++) {				
				System.out.println("Digite um numero inteiro: ");
				numero = scan.nextInt();
				if(numero % 2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
			System.out.println("Quantidade de Números Pares Digitados: " + pares);
			System.out.println("Quantidade de Números Inpares Digitados: " + impares);
		}
	}
}
