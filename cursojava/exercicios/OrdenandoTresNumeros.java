package com.natanael.cursojava.exercicios;

import java.util.Scanner;

public class OrdenandoTresNumeros {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com um numero inteiro");
			int num1 = scan.nextInt();
			
			System.out.println("Entre com um numero inteiro");
			int num2 = scan.nextInt();
			
			System.out.println("Entre com um numero inteiro");
			int num3 = scan.nextInt();
			
			if(num1 < num2 && num2 < num3) {
				System.out.println("Ordem: " + num1 + "," + num2 + "," + num3);
			}			
			else if(num1 > num2 && num2 > num3) {
				System.out.println("Ordem: " + num3 + "," + num2 + "," + num1);
			}
			else if(num1 < num3 && num1 > num2) {
				System.out.println("Ordem: " + num2 + "," + num1 + "," + num3);
			}
			else if(num1 > num3 && num1 < num2) {
				System.out.println("Ordem: " + num3 + "," + num1 + "," + num2);
			}
			else if(num3 > num1 && num2 > num1) {
				System.out.println("Ordem: " + num1 + "," + num3 + "," + num2);
			}
			else if(num3 > num2 && num2 < num3) {
				System.out.println("Ordem: " + num2 + "," + num3 + "," + num1);
			}
			else {
				System.out.println("Não digite números iguais ");
			}
		}
	}
}
