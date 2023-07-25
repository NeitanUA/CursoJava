package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
		
			boolean flag = true;
		
		while(flag == true) {
			System.out.println("Entre com uma nota, entre 0 e 10: ");
			int nota = scan.nextInt();
			
					if(nota >= 0 && nota <= 10) {
						System.out.println("Numero Valido! ");
						flag = false;
				}
					else {
					System.out.println("Numero Invalido! ");					
				}					
			}
		}			
	}
}