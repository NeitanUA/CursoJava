package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double[] vetorA = new double[20];			
			
			System.out.print("Entre com a cotação Atual do Dólar: ");
			double cotacaoDolar = scan.nextDouble();
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print("Entre com o Elemento " + i + " do VetorA: ");				
				vetorA[i] = cotacaoDolar * scan.nextInt(); 
			}
			
			System.out.print("Cotação Atual dos Valores é: ");
			for(double i : vetorA) {
				System.out.print(i + ", ");
			}
			
		}
	}
}
