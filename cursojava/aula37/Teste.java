package com.natanael.cursojava.aula37;

public class Teste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Pessoa alunoP = new Aluno();
		
		aluno.setNome("Neitan");
		aluno.setTelefoneCelular("123456789");
		alunoP.setCpf("00000000000");
				
		System.out.println(aluno.getNome());
		System.out.println(aluno.getTelefoneCelular());
		System.out.println(alunoP.getCpf());
		
		
	}
}
