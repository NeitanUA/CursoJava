package com.natanael.cursojava.aula24.labs;

public class Exercicio2 {
	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.nome = "Código Limpo";
		livro.altor = "Robert Cecil Martin";
		livro.dataPublicacao = "01/08/2008";
		
		System.out.println("Nome: " + livro.nome);
		System.out.println("Altor: " + livro.altor);
		System.out.println("Data de Publicação: " + livro.dataPublicacao);
	}	
}
