package com.natanael.cursojava.aula33.labs;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Aluno aluno = new Aluno();

			System.out.println("Entre com o nome do aluno");
			aluno.setNome(scan.next());

			System.out.println("Entre com o nome do curso");
			aluno.setNomeCurso(scan.next());

			System.out.println("Entre com a matricula");
			aluno.setMatricula(scan.next());

			for (int i = 0; i < aluno.getNomeDiciplinas().length; i++) {
				System.out.println("Entre com o nome da disciplina " + (i + 1));
				aluno.setNomeDisciplinaPos(i, scan.next());
			}
			
			for(int i=0; i<aluno.getNotasDiciplinas().length; i++) {
				System.out.println("Obtendo notas da disciplina " + aluno.getNomeDiciplinas()[i]);
				for(int j=0; j<aluno.getNotasDiciplinas()[i].length; j++) {
					System.out.println("Entre com a nota " + (j+1));
					aluno.setNomePosIJ(i, j, scan.nextDouble());
				}
			}
			
			aluno.mostrarInfo();
			
			for(int i=0; i<aluno.getNomeDiciplinas().length; i++) {
				if(aluno.verificarAprovado(i)) {
					System.out.println();
					System.out.println("Disciplina " + aluno.getNomeDiciplinas()[i] + "- Foi aprovado");
				}else {
					System.out.println();
					System.out.println("Disciplina " + aluno.getNomeDiciplinas()[i] + "- Foi reprovado");
				}
			}
		}
	}
}
