package com.natanael.cursojava.aula18;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Exercicio4 {
	public static void main(String[] args) {	
		try(Scanner scan = new Scanner(System.in);) {
			int[] vetorA = new int[15];
			double[] vetorB = new double[vetorA.length];
			for(int i = 0; i < vetorA.length; i++) {
				System.out.print("Digite um numero: ");
				vetorA[i] = scan.nextInt();
				vetorB[i] = Math.sqrt(vetorA[i]);
			}
			DecimalFormat dec = new DecimalFormat("###,##.##");
			System.out.println();
			
			System.out.print("Vetor A = ");
			for(int i : vetorA) {
				System.out.print(i + ", ");
			}
			
			System.out.println();
			
			System.out.print("Vetor B = ");
			for(double i : vetorB) {
				System.out.print(dec.format(i) + ", ");
			}			
		}
	}
}
