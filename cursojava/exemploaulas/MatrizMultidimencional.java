package com.natanael.cursojava.exemploaulas;

import java.util.Locale;
import java.util.Scanner;

public class MatrizMultidimencional {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			int[][][] cubo = new int [3][3][3];
			int pares = 0;
			int inpares = 0;
			int total = 0;
			
			for(int i=0; i<cubo.length; i++) {
				for(int j=0; j < cubo[i].length; j++) {					
					for(int k=0; k<cubo[i][j].length; k++) {
						System.out.println("i = " + i + " - j = " + j + " - k = " + k);
						cubo[i][j][k] = (i + j + k); 
					}					
				}
			}
			
			for(int i=0; i<cubo.length; i++) {
				for(int j=0; j < cubo[i].length; j++) {
					for(int k=0; k<cubo[i][j].length; k++) {
						total += cubo[i][j][k];
						if(cubo[i][j][k] % 2 == 0) {
							pares += cubo[i][j][k];
						}else {
							inpares += cubo[i][j][k];
						}
					}				
				}				
			}
			System.out.println("Pares: " + pares);
			System.out.println("Inpares: " + inpares);
			System.out.println("Total: " + total);
		}
	}
}
