package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			System.out.println("Digite o Número de 1 a 10 para Gerar a Tabuada: ");			
			int numero = scan.nextInt();
			System.out.println("Tabuada de " + numero + ":");
			for(int i = 1; i < 11; i++) {				 
				System.out.println(numero + " X " + i + " = " + (numero * i));
			}
		}
	}
}
