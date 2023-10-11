package com.natanael.cursojava.aula47;

public class Excecao {
	public static void main(String[] args) {		
		
		try {
			
			int[] vetor = new int[4];			
			System.out.println("Antes da exception");			
			vetor[4] = 1;
			
			System.out.println("Não será impresso após a exception");
		}
		
		catch(ArrayIndexOutOfBoundsException exception) {
			
			System.out.println("Erro após acessar uma posição do Array fora do limite");
		}
		
		System.out.println("Esse será impresso após a exception");
	}
}
