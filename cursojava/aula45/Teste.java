package com.natanael.cursojava.aula45;

public class Teste {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Pessoa alunoPessoa = aluno1; //upcasting
		Aluno pessoaAluno = (Aluno) alunoPessoa; //downcasting				
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if(pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}
		if(prof instanceof Professor) {
			System.out.println("É do tipo Professor");
		}
		if(aluno instanceof Aluno) {
			System.out.println("É do tipo Aluno");
		}
		if(pessoaAluno instanceof Object) {
			System.out.println("É do tipo Objeto");
		}
	}
}
