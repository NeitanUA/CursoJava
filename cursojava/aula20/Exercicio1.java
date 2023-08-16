package com.natanael.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[][] matriz = new int[4][4];
			Random ran = new Random();
			int maiorNumero = Integer.MIN_VALUE;
			int linha = 0;
			int coluna = 0;
			
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz[i].length; j++) {
					matriz[i][j] = ran.nextInt(0, 9);
					if(matriz[i][j] >= maiorNumero) {
						maiorNumero = matriz[i][j];
						linha = i;
						coluna = j;
					}
				}
			}
			
			System.out.print("O Maior Número é " + maiorNumero + 
					" e sua Posição é linha " + linha + " Coluna " + coluna);
		}		
	}

}
