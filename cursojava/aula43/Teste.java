package com.natanael.cursojava.aula43;

public class Teste {
	
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Sistemas de Informação");		
		double[] notas = {6, 9, 10, 6};		
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "aaaaaaaaaaaf";
		String s2 = "aaaaaaaaaaaf";
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Sistemas de Informação");		
		double[] notas2 = {7, 9, 10, 6};		
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}
}
