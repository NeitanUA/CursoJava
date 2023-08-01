package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			int nota;
			boolean valido = false;
		
		do {
			System.out.println("Entre com uma nota, entre 0 e 10: ");
			nota = scan.nextInt();			
			if(nota >= 0 && nota <= 10) 
			{
				System.out.println("Numero Valido! ");
				valido = true;
			}
			else 
			{
				System.out.println("Numero Invalido! ");					
			}			
			}while(valido == false);
		}			
	}
}