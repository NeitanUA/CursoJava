package com.natanael.cursojava.aula36.labs;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			
			Curso curso = new Curso();
			System.out.println("Entre com o nome do curso: ");
			curso.setNome(scan.next());
			
			System.out.println("Entre com o horário do curso: ");
			curso.setHorario(scan.next());
			
			Professor professor = new Professor();
			System.out.println("Entre com o nome do professor: ");
			professor.setNome(scan.next());			
			
			System.out.println("Entre com departamento do professor: ");
			professor.setDepartamento(scan.next());
			
			System.out.println("Entre com o email do professor: ");
			professor.setEmail(scan.next());
			
			curso.setProfessor(professor);
			
			Aluno[] arrayAlunos = new Aluno[5]; 
			
			for(int i=0; i<arrayAlunos.length; i++) {
				
				Aluno alunos = new Aluno();
				System.out.println("Entre com o nome do "+(i+1)+"º aluno: ");
				alunos.setNome(scan.next());
								
				System.out.println("Entre com o número da matricula do "+(i+1)+"º aluno: ");
				alunos.setMatricula(scan.next());
				
				double[] notas = new double[4];
				
				for(int j=0; j<notas.length; j++) {
					System.out.println("Entre com a "+ (j+1)+ "º nota: ");
					notas[j] = scan.nextDouble();
				}
				
				alunos.setNotas(notas);
				arrayAlunos[i] = alunos;
			}
			curso.setAlunos(arrayAlunos);
			
			System.out.println(curso.exibirInfos());
		}		
	}
}
