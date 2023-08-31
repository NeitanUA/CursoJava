package com.natanael.cursojava.exemploaulas;

import java.util.Scanner;

public class ArrayIrregular {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {			
			
			System.out.println("Quantas Pessoas Serão Intrevistadas: ");
			int numPessoas = scan.nextInt();			
			String[][] nomeCriancas = new String[numPessoas][];
			
			
			for(int i=0; i<nomeCriancas.length; i++) {
				System.out.println("Quantas Crianças a " + (i + 1) + "º Pessoa tem: ");				
				nomeCriancas[i] = new String [scan.nextInt()];
				
				for(int j=0; j<nomeCriancas[i].length; j++) {
					System.out.println("Digite o Nome do " + (j+1) + "º Filho: ");
					nomeCriancas[i][j] = scan.next();
				}
			}
						
			for(int i=0; i<nomeCriancas.length; i++) {
				System.out.println(("Pessoa " + (i+1) + " tem " + nomeCriancas[i].length + " Filhos: "));
				for(int j=0; j<nomeCriancas[i].length; j++) {
					
					System.out.println((j+1) + "º Criança: " + nomeCriancas[i][j]);
				}
				System.out.println();
			}
		}
	}
}
