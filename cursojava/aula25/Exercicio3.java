package com.natanael.cursojava.aula25;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			boolean sair = false;
			String escolha;
			
			Aluno aluno = new Aluno();
			
			aluno.nome = "Natanael Guimarães";
			aluno.curso = "Sistemas de Informação";
			aluno.matricula = "20864051";
			
			aluno.disciplinas[0] = "Algoritimos";
			aluno.disciplinas[1] = "Administração";
			aluno.disciplinas[2] = "Programação Web";
			
			aluno.notas[0] = 10f;
			aluno.notas[1] = 6.5f;
			aluno.notas[2] = 10f;
			
			System.out.println("Estudante: " + aluno.nome);
			System.out.println("Cursando: " + aluno.curso);
			System.out.println("Número da Matricula: " + aluno.matricula);
			
			while(!sair) {								
				System.out.println("Precione 0 Para Sair");
				System.out.println("Precione 1 Para Ver se Esta Aprovado ou Reprovado");
				System.out.println("Precione 2 Para Ver as Disciplinas");
				System.out.println("Precione 3 Para Ver as Notas");
				escolha = scan.next();
				
				switch(escolha) {
				case "0":
					sair = true;
				break;
				
				case "1":
					aluno.mostrarAprovado();
				break;
				
				case "2":
					aluno.mostrarDisciplinas();;
				break;
				
				case "3":
					aluno.mostrarNotas();
				break;
				}
			}
		}
	}
}
