package com.natanael.cursojava.exercicios;

import java.util.Scanner;

public class Urion1478 {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {			
			
			int N = scan.nextInt();
			
			while (N != 0 ) {
				int[][] vetorA = new int [N][N];
				
				for(int i=0; i < vetorA.length; i++) {
					for(int j=0; j<vetorA[i].length; j++) {
						vetorA[i][j] = 1 + Math.abs(i - j);
					}					
				}
				
				StringBuffer sb = new StringBuffer();
				
				for(int i=0; i < vetorA.length; i++) {
					sb.append(String.format("%3d", vetorA[i][0]));
					for(int j=1; j<vetorA[i].length; j++) {
						sb.append(String.format(" %3d", vetorA[i][j]));
					}
					sb.append(System.lineSeparator());
				}
				System.out.println(sb);
				
				N = scan.nextInt();
			}
		}
	}
}
