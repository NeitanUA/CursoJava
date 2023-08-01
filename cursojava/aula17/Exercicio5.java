package com.natanael.cursojava.aula17;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double habitantesA;
			double habitantesB;
			double cresA;
			double cresB;
			
			boolean flag = true;
			
			do {
				System.out.println("Informe o numero de habitantes do primeiro pais: ");
				habitantesA = scan.nextDouble();
				
				if(habitantesA <= 0) {
					System.out.println("Informe o numero de habitantes maior que 0: ");
				}
				else {
					flag = false;
				}		
			}while(flag);	
			
			flag = true;
			do {				
				System.out.println("Informe a taixa de crescimento do primeiro pais: ");
				cresA = scan.nextDouble();
					
				if(cresA <= 0) {
					System.out.println("Informe a taixa de crescimento maior que 0: ");
				}
				else {
					flag = false;
				}
			}while(flag);
			
			flag = true;
			do {								
				System.out.println("Informe o numero de habitantes do segundo pais: ");
				habitantesB = scan.nextDouble();
				if(habitantesB <= 0) {
					System.out.println("Informe o numero de habitantes maior que 0: ");
				}
				else {
					flag = false;
				}				
			}while(flag);
			
			
			flag = true;
			do {
				System.out.println("Informe a taixa de crescimento do segundo pais: ");
				cresB = scan.nextDouble();
				if(cresB <= 0) {
					System.out.println("Informe a taixa de crescimento maior que 0: ");
				}
				else {
					flag = false;
				}					
			}while(flag); 
			
			int cont = 0;
			
			while(habitantesA < habitantesB) {
				habitantesA += ((habitantesA / 100) * cresA);
				habitantesB += ((habitantesB / 100) * cresB);			
				cont ++;
			}
			System.out.println("habitantes A: " + habitantesA);
			System.out.println("habitantes B: " + habitantesB);
			System.out.println("Anos: " + cont);
		}		
	}
}
