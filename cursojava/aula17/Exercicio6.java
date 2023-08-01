package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			String num;
			boolean valido = false;
			do {
				System.out.print("Precione \"1\" para imprimir um ao lado do outro, ou \"2\" para imprimir um abaixo do outro: ");
				num = scan.next();
				if(num.equals("1") || num.equals("2")) {					
					valido = true;
				}else {
					System.out.print("Numero Invalido, ");
				}
			}while(!valido);
			
			for (int i = 1; i <= 20; i++) {
				switch(num) {
				case "1": System.out.print("" + i + ", "); break;
				case "2": System.out.println("" + i + ", "); break;
				}
			}
		}
			
	}	
}
