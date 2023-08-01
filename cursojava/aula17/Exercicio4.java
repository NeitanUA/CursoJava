package com.natanael.cursojava.aula17;

public class Exercicio4 {

	public static void main(String[] args) {
		int habitantesA = 80000;
		int habitantesB = 200000;
		int cont = 0;
		
		while(habitantesA < habitantesB) {
			habitantesA += ((habitantesA / 100) * 3);
			habitantesB += ((habitantesB / 100) * 1.5);			
			cont ++;
		}
		System.out.println("habitantes A: " + habitantesA);
		System.out.println("habitantes B: " + habitantesB);
		System.out.println("Anos: " + cont);
	}
}
