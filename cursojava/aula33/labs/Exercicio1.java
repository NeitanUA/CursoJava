package com.natanael.cursojava.aula33.labs;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Lampada lampada = new Lampada("Led", "Baixo", 10);		
		boolean sair = false;
		String tecla;
		boolean status = false;
		
		try(Scanner scan = new Scanner(System.in)) {			
			while(!sair) {
				
				if(status == true) {
					System.out.println("Lampa ligada");
				}else {
					System.out.println("Lampa desligada");
				}
				
				System.out.println("Precione 0 para sair");
				System.out.println("Precione 1 para ligar a lampada");				
				System.out.println("Precione 2 para desligar a lampada");
				tecla = scan.next();
				
				switch(tecla) {
				case "0":
					sair = true;
				break;
				
				case "1":
					status = lampada.ligarLampada();
				break;
				
				case "2":
					status = lampada.desligarLampada();
				break;
				
				default:
					System.out.println("Número invalido");
				break;
				}														
			}
		}				
	}
}
