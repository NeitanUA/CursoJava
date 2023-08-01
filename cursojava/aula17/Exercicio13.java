package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.print("Digite a Base: ");
			int base = scan.nextInt();
			System.out.print("Digite o Expoente: ");
			int expoente = scan.nextInt();
						
			int resultado = base;
			for(int i = 1; i < expoente; i++) {								
				System.out.println("Resultado de i " + i);
				resultado *= base;
			}			
			System.out.println("Resultado: " + resultado);
		}

	}

}
