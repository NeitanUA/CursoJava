package com.natanael.cursojava.aula18;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {			
			String[] aluno = new String[10];
			double[] nota1 = new double[aluno.length];
			double[] nota2 = new double[aluno.length];
			double[] result = new double[aluno.length];

			for (int i = 0; i < aluno.length; i++) {
				System.out.print("Entre com o Nome do " + (i + 1) + "º Aluno: ");
				aluno[i] = scan.next();			
			}
			
			for (int i = 0; i < aluno.length; i++) {
				System.out.print("Entre com a Nota 1 do " + (i + 1) + "º Aluno: ");
				nota1[i] = scan.nextDouble();			
			}
			
			for (int i = 0; i < aluno.length; i++) {
				System.out.print("Entre com a Nota 2 do " + (i + 1) + "º Aluno: ");
				nota2[i] = scan.nextDouble();			
			}
			
			for (int i = 0; i < aluno.length; i++) {
				result[i] = ((nota1[i] + nota2[i])/ 2); 
			}
			
			System.out.println("Alunos: ");
			for (int i = 0; i < aluno.length; i++) {
				System.out.print((i + 1) + ":" + aluno[i] + ", ");
			}
			System.out.println();
			System.out.println();
			
			System.out.println("Médias: ");
			for (int i = 0; i < aluno.length; i++) {
				System.out.print((i + 1) + ":" + result[i] + ", ");
			}
			System.out.println();
			System.out.println();
			
			System.out.println("Aprovados ou reprovados: ");
			for (int i = 0; i < aluno.length; i++) {
				if(result[i] >=7) {
					System.out.print((i + 1) + ":Aprovado, ");
				}else {
					System.out.print((i + 1) + ":Reprovado, ");
				}
			}
			System.out.println();
		}
	}
}
