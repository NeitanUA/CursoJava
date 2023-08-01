package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			System.out.print("Digite o número inicial: ");
			int primeiro = scan.nextInt();
			System.out.print("Digite o ultimo número: ");
			int ultimo = scan.nextInt();	
			
			do{
				System.out.print("" + primeiro + ", ");	
				primeiro++;							
			}while(primeiro < ultimo + 1);
		}
	}

}
