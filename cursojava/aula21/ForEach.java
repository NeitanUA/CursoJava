package com.natanael.cursojava.aula21;

import java.util.Random;

public class ForEach {
	public static void main(String[] args) {
		int[][] notas = new int[10][10];
		Random random = new Random();
		
		for (int i=0; i<notas.length; i++) {			
				for(int j=0; j<notas[i].length; j++) {
					notas[i][j] = random.nextInt(10);
				}
		}
		
		for(int nota[] : notas) {
			for(int i : nota) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
	}
}
