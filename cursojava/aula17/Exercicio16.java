package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int valor1 = 1;
			int valor2 = 1;
			int resultado = 0;
			
			for(int i = 1; i <= 13; i++) {
				resultado = valor1 + valor2;
				valor1 = valor2; 
				valor2 = resultado;
				
				System.out.println(resultado + ", ");
			}
		}
	}
}
