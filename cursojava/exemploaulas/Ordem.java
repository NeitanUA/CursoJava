package com.natanael.cursojava.exemploaulas;

import java.util.Scanner;

public class Ordem {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com um numero inteiro");
			int num1 = scan.nextInt();
			
			System.out.println("Entre com um numero inteiro");
			int num2 = scan.nextInt();
			
			System.out.println("Entre com um numero inteiro");
			int num3 = scan.nextInt();
			
			if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
				//123
				System.out.println("Ordem: " + num1 + "," + num2 + "," + num3);
			}
			else if(num1 <= num2 && num1 <= num3 && num3 <= num2) {
				//132
				System.out.println("Ordem: " + num1 + "," + num3 + "," + num2);
			}
			else if(num2 <= num1 && num2 <= num3 && num1 <= num3) {
				//213
				System.out.println("Ordem: " + num2 + "," + num1 + "," + num3);
			}
			else if(num3 <= num2 && num3 <= num1 && num1 <= num2) {
				//231
				System.out.println("Ordem: " + num3 + "," + num1 + "," + num2);
			}
			else if(num3 <= num2 && num3 <= num1 && num2 <= num1) {
				//321
				System.out.println("Ordem: " + num3 + "," + num2 + "," + num1);
			}
			else if(num2 <= num1 && num2 <= num3 && num2 <= num1) {
				//312
				System.out.println("Ordem: " + num2 + "," + num3 + "," + num1);
			}

		}
	}
}
