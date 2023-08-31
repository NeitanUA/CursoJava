package com.natanael.cursojava.aula25;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	float[] notas = new float[3];
	
	void mostrarAprovado() {
		System.out.println("======= Status de Aprovação =======");
		for(int i=0; i<notas.length; i++) {
			if(notas[i] >= 7) {
				System.out.println( "Aprovado em " + disciplinas[i]);
			}else {
				System.out.println( "Reprovado em " + disciplinas[i]);
			}
		}
		System.out.println("===================================");
	}
	
	void mostrarDisciplinas() {
		System.out.println("======= Disciplinas =======");
		for(int i=0; i<notas.length; i++) {
			System.out.println(disciplinas[i]);
		}
		System.out.println("=====================");
	}
	
	void mostrarNotas() {
		System.out.println("======= Notas =======");
		for(int i=0; i<notas.length; i++) {
			System.out.println(disciplinas[i] + ": "+ notas[i]);
		}
		System.out.println("=====================");
	}
}
